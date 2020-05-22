package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/21 17:44
 */
public class AddStudent {
  public static void add(ArrayList<Students> array) {
    Scanner sc = new Scanner(System.in);
    String id;
    while (true) {
      System.out.println("请输入你的学号");
      id = sc.nextLine();
      // 判断ID是否重复；
      boolean flag = false;
      for (int i = 0; i < array.size(); i++) {
        Students st = array.get(i);
        if (st.getId().equals(id)) {
          flag = true;
          break;
        }
      }
      if (flag) {
        System.out.println("对不起，学号被占用");
      } else {
        break;
      }
    }
    System.out.println("请输入你的姓名");
    String name = sc.nextLine();
    System.out.println("请输入你的年龄");
    int age = sc.nextInt();
    Students s = new Students();
    s.setId(id);
    s.setName(name);
    s.setAge(age);
    array.add(s);
    System.out.println("添加成功");
  }
}
