package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:14
 */
public class DeleteStudent {
  public static void delete(ArrayList<Students> array) {
    Students students = new Students("2", "李四", 25);
    Students students7 = new Students("8", "赵六", 28);
    array.add(students);
    array.add(students7);
    for (Students students1 : array) {
      System.out.println("所有学生信息为： " + students1);
    }
    System.out.println("请输入需要删除的学号");
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    for (int i = 0; i < array.size(); i++) {
      Students s1 = array.get(i);
      if (s1.getId().equals(id)) {
        array.remove(i);
        System.out.println("删除成功");
      } else {
        System.out.println("对不起，该学号不存在");
      }
    }
    for (Students students1 : array) {
      System.out.println("删除后的学生信息为； " + students1);
    }
  }
}
