package OneStage.firstwork;

/**
 * @author : zhoumin
 * @data :  2020/5/3 17:30
 */
public class SecondQuestion {
  //编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      int sum = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          sum += j;
        }
      }
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}
