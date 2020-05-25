package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:14
 */
public class SelectStudent {
  public static void selectAll(ArrayList<Students> array) {
    for (Students students2 : array) {
      System.out.println("所有学生的信息为： " + students2);
    }
    if (array.size() == 0) {
      System.out.println("对不起，没有学生信息");
      System.out.println("请重新选择");
      return;
    }
    for (int i = 0; i < array.size(); i++) {
      Students s = array.get(i);
      System.out.println("学号是: " + s.getId() + "  " + "姓名是: " + s.getName() + "   " + "年龄是: " + s.getAge() + "   ");
    }
  }

  public static void select(ArrayList<Students> array, String id) {
    boolean flag = false;
    int j = -1;
    for (int i = 0; i < array.size(); i++) {
      Students students1 = array.get(i);
      if (students1.getId().equals(id)) {
        flag = true;
        j = i;
      }
    }
    if (flag) {
      System.out.println(array.get(j));
    }else {
      System.out.println("该学生不在地球哦-----");
    }
  }
}
