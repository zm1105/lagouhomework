package OneStage.firstwork;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author : zhoumin
 * @data :  2020/5/3 17:59
 */
public class ThirdQuestion {
  /**
   * 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间
   * 不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码
   */
  public static void main(String[] args) {
    Random random = new Random();
    int blue = random.nextInt(16) + 1;
    Set<Integer> set = new HashSet<>();
    while (set.size() < 6) {
      set.add((int) (Math.random() * 33 + 1));
    }
    System.out.print("红球是" + "：");
    for (Integer red : set) {
      System.out.print(red + " ");

    }
    System.out.println("蓝球是：" + blue);


  }


}
