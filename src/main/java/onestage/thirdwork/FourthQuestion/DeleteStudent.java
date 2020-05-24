package onestage.thirdwork.FourthQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/21 18:14
 */
public class DeleteStudent {
  public static void delete(ArrayList<Students> array) {
    for (Students students1 : array) {
      System.out.println("所有学生信息为： " + students1);
    }
    System.out.println("请输入需要删除的学号");
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    Boolean falg= false;
    int j =-1;
    for (int i = 0; i < array.size(); i++) {
      Students s1 = array.get(i);
      if (s1.getId().equals(id)) {
        falg=true;
        j=i;
      }
    }if (falg){
      array.remove(j);
      System.out.println("删除成功");
    }else {
      System.out.println("sorry，该学生不在地球");
    }

    for (Students students1 : array) {
      System.out.println("删除后的学生信息为； " + students1);
    }
  }
}
