package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:14
 */
public class SelectStudent {
  public static void select(ArrayList<Students> array) {

    Students students = new Students("1", "张三", 25);
    array.add(students);

    if (array.size() == 0) {
      System.out.println("对不起，没有学生信息");
      System.out.println("请重新选择");
      return;
    }
    for (int i = 0; i < array.size(); i++) {
      Students s = array.get(i);
      System.out.println("学号是: " + s.getId() + "  "+"姓名是: " + s.getName() + "   "+"年龄是: " + s.getAge()+"   ");
    }
  }
}
