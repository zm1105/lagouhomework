package onestage.thirdwork.fourthquestion;

import onestage.fourthwork.FirstQuestion.ArrayListToFile;
import onestage.fourthwork.FirstQuestion.ageException;
import onestage.fourthwork.FirstQuestion.idException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/21 17:54
 */
public class menu {
  /**
   * 根据用户输入的选择去实现增加、删除、修改、查找以及遍历所有学生信息的功能。
   */
  private static Scanner sc;
  private static Object Students;



  public static void choice() throws ageException, IOException, idException {

    sc = new Scanner(System.in);
    ArrayListToFile alt = new ArrayListToFile();
    alt.read();

    try {
      while (true) {
        //功能菜单界面，每次使用一个功能时，都会把功能菜单打印一次，便于使用者查询功能对应的数字
        System.out.println("功能菜单：");
        System.out.println("----------------------------------");
        System.out.println("1、查询所有学生信息");
        System.out.println("2、增加学生信息");
        System.out.println("3、删除学生信息");
        System.out.println("4、修改学生信息");
        System.out.println("5、查询一个学生信息");
        System.out.println("6、退出系统");
        System.out.println("----------------------------------");
        System.out.print("请输入对应的数字进行操作:");
        //输入数字选择功能
        int input = sc.nextInt();
        //输入的数字在1-6时，能执行功能
        //List<Students> array = new ArrayList<>();
        if (input > 0 && input < 7) {
          switch (input) {
            case 2:
              AddStudent.add((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array);
              break;
            case 3:
              DeleteStudent.delete((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array);
              break;
            case 4:
              UpdateStudent.update((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array);
              break;
            case 1:
              SelectStudent.selectAll((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array);
              break;
            case 5:
              SelectStudent.selectAll((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array);
              System.out.println("输入需要查询的学号");
              Scanner scanner = new Scanner(System.in);
              String id = scanner.nextLine();
              SelectStudent.select((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array, id);
              break;
            case 6:

              alt.write((ArrayList<onestage.thirdwork.fourthquestion.Students>) ArrayListToFile.array);
              signOut.out();
              return;
          }
        } else {
          System.out.println("\033[31;0m" + "该功能正在开发中，请重新选择" + "\033[0m");
        }
      }
    } catch (Exception e) {
      System.out.println("输入有误");
    }
  }
}

