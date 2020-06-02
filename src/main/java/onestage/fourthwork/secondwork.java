package onestage.fourthwork;

import java.io.File;

/**
 * @author : zhoumin
 * @data :  2020/6/2 17:10
 */
public class secondwork {
  /**
   * 实现将指定目录中的所有内容删除，包含子目录中的内容都要全部删除。
   */
  static int flag = 1;

  public static void main(String[] args) {
//删除一个文件夹下的所有文件(包括子目录内的文件)
    File file = new File("D:\\delete");//输入要删除文件目录的绝对路径
    deleteFile(file);
    if (flag == 1) {
      System.out.println("文件删除成功！");
    }
  }

  public static void deleteFile(File file) {
    //判断文件不为null或文件目录存在
    if (file == null || !file.exists()) {
      flag = 0;
      System.out.println("文件删除失败,请检查文件路径是否正确");
      return;
    }
    //取得这个目录下的所有子文件对象
    File[] files = file.listFiles();
    //遍历该目录下的文件对象
    for (File f : files) {
      //打印文件名
      String name = file.getName();
      System.out.println(name);
      //判断子目录是否存在子目录,如果是文件则删除
      if (f.isDirectory()) {
        deleteFile(f);
      } else {
        f.delete();
      }
    }
    //删除空文件夹  for循环已经把上一层节点的目录清空。
    file.delete();
  }


}
