package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:14
 */
public class SelectStudent {
  public static void select(ArrayList<Students> array) {

    Students students = new Students("1", "张三", 25);
    Students students1 = new Students("2", "李四", 26);
    array.add(students);
    array.add(students1);
    for (Students students2 : array) {
      System.out.println("所有学生的信息为： "+students2);
    }

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
