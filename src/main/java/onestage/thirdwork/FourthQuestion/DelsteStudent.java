package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:14
 */
public class DelsteStudent {
  public static void delete(ArrayList<Students> array) {
    Students students = new Students("2", "李四", 25);
    array.add(students);
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
  }
}
