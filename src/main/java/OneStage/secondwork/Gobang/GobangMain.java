package OneStage.secondwork.Gobang;

import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/14 12:34
 */
public class GobangMain {
  public static String white = "白色";
  public static String black = "黑色";
  public static boolean color = true;
  //存储坐标
  public static String spoint;

  public static void main(String[] args) {
    try {
      Gobang gobang = new Gobang();
      Scanner scanner = new Scanner(System.in);
      while (true) {
        System.out.println("请" + (color ? white : black) + "落子：");
        //获得坐标

        spoint = scanner.next();
        //解析坐标，并返回坐标对象
        Point point = gobang.analysisPoint(spoint);

        if (gobang.luoZi(point, color)) {
          gobang.printMap();
          if (gobang.isWin(point, color)) {
            System.out.println("" + (color ? white : black) + "赢了！");
            break;
          }
          color = !color;
        }
      }
    } catch (Exception e) {
      System.out.println("请用英文状态输入坐标 x,y");
    }
  }
}
