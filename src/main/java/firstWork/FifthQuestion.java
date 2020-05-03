package firstWork;

/**
 * @author : zhoumin
 * @data :  2020/5/3 19:03
 */
public class FifthQuestion {
  /**
   * 使用二维数组和循环实现五子棋游戏棋盘的绘制
   */
  public static void main(String[] args) {
    for (int i = 0; i < 17; i++) {
      if (i == 0) {
        System.out.print(" " + " ");
      } else {
        System.out.print(Integer.toHexString(i - 1) + " ");
      }
      for (int j = 0; j < 16; j++) {
        if (i == 0) {
          System.out.print(Integer.toHexString(j) + " ");
        } else {
          System.out.print("+" + " ");
        }
      }
      System.out.println();
    }
  }
}
