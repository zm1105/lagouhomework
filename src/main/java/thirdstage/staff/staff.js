// 首先table表格是对数据的展示 结构为[{...}],所有的操作也都是对数据的操作，最后展示到页面上
// 所有先定义一组初始化数据
let tableData = [{ num: 123 }, {}];
// 编辑状态下的index
let editorIndex = undefined;

// 其次要定义一个渲染函数，籍此把数据展示到页面上 这里不做太过复杂的操作，就不用传入配置(函数参数)
function renderTable () {
    // 首先拿到渲染函数被挂载的元素
    let parentDom = $('.tableTbody')[0];
    // 清空parentDom以对table进行重新渲染
    parentDom.innerHTML = "";
    // 判断tableData有没有数据，如果没有数据，则返回兜底内容
    if (tableData.length > 0) {
        // 有数据的情况
        $('.showTableLast').hide()
        let jsonHtml = '';
        tableData.forEach((res = {}, index) => {
            jsonHtml +=
                `<tr class="${res.type}">
                    <td><input type="checkbox" name="name"></td>
                    <td>${res.num || '暂无数据'}</td>
                    <td>${res.username || '暂无数据'}</td>
                    <td>${res.gender || '暂无数据'}</td>
                    <td>${res.pwd || '暂无数据'}</td>
                    <td>${res.age || '暂无数据'}</td>
                    <td>${res.birth || '暂无数据'}</td>
                    <td style="width: 140px">
                        <button class="btn btn-info editor" index='${index || '暂无数据'}'>编辑</button>
                        <button class="btn btn-info delete" index='${index || '暂无数据'}'>删除</button>
                    </td>
                </tr>`
        })
        parentDom.innerHTML = jsonHtml;
    } else {
        // 没有数据的情况
        $('.showTableLast').show()
    }
}
//  初始化数据时对其进行处理
renderTable()

//  处理表格里的操作事件，因为内容都属于未来元素，所以无法事先对其添加事件，所有可以换一种思路
//  点击表格的时候也可以得到相应的信息，点击表格，判断其是否是想点击的那个按钮，并对其进行处理
//  首先获取点击表格在页面里的dom元素
let tableDom = $('#orderTable')
tableDom.on('click', '.editor', function (e) {
    //  点击编辑按钮,首先抽屉展示
    $('.formName').html('编辑')
    $('#montLayer').show()
    //  获取按钮在数据表中的index
    console.log('点击了编辑按钮', $(e.currentTarget).attr('index'))
    let index = $(e.currentTarget).attr('index');
    //  数据回显
    handlerForm(tableData[index]);
    // 存储一份证明是编辑状态的index项
    editorIndex = index;
})
tableDom.on('click', '.delete', function (e) {
    //  获取按钮在数据表中的index
    console.log('点击了删除按钮', $(e.currentTarget).attr('index'));
    let index = $(e.currentTarget).attr('index');
    // 点击删除不做多余的操作，只是在数据表中删除当前一项，如果是包括前后端交互，则会向后端传入当前项的唯一值ID，并在数据库中删除，然后前端重新获取数据并渲染
    tableData.splice(index, 1);
    //并且重新渲染数据
    renderTable()
})

// 构建一个函数,可以处理抽屉里的表格内容,接收一个对象,内容是表格里的数据的内容
function handlerForm (obj = {}) {
    let formID = ['num', 'username', 'gender', 'pwd', 'age', 'birth'];
    formID.forEach(res => {
        $(`#montLayer #${res}`).val(obj[res])
    })
}

function closeDrawer () {
    $('#montLayer').hide();
    editorIndex = undefined;
    handlerForm()
}
// 点击x的时候关闭drawer,并且将数据清空
$('.formOperation').on('click', closeDrawer)

// 点击新增展示drawer
$('#add_row').on('click', function () {
    $('.formName').html('新增');
    $('#montLayer').show();
    editorIndex = tableData.length
})

//点击提交的时候触发
$('.formSubmit').on('click', function () {
    let obj = {};
    let formID = ['num', 'username', 'gender', 'pwd', 'age', 'birth'];
    formID.forEach(res => {
        // 获取input数据
        obj[res] = $(`#montLayer #${res}`).val()
    })
    // 给table数据赋值
    tableData[editorIndex] = obj;
    // 关闭drawer
    closeDrawer()
    // 重新渲染 
    renderTable()
})