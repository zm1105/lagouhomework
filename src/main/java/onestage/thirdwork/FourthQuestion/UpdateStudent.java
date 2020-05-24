package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:15
 */
public class UpdateStudent {
  public static void update(ArrayList<Students> array) {
    Students students = new Students("2", "李四", 25);
    Students students3 = new Students("7", "王五", 29);
    array.add(students);
    array.add(students3);
    for (Students students1 : array) {
      System.out.println("所有学生的信息为： "+students1);
    }
    System.out.println("请输入需要修改的学生信息学号");
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    int index = -1;
    for (int i = 0; i < array.size(); i++) {
      Students students1 = array.get(i);
      if (students1.getId().equals(id)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("不好意思，你要修改的学生信息不存在");
    } else {
      System.out.println("请输入学生姓名");
      String name = scanner.nextLine();
      System.out.println("请输入学生年龄");
      int age = scanner.nextInt();
      System.out.println("请输入学生地址");
      //创建学生对象
      Students s = new Students();
      s.setId(id);
      s.setId(name);
      s.setAge(age);

      //修改集合中的学生对象
      array.set(index, s);
      System.out.println("修改学生成功");
    }
  }
}
