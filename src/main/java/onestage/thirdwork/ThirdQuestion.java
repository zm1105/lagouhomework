package onestage.thirdwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : zhoumin
 * @data :  2020/5/20 17:34
 */
public class ThirdQuestion {
  /**
   * 准备一个 HashMap 集合，统计字符串"123,456,789,123,456"中每个数字字符串出现的次数并打印出来。
   * <p>
   * 如：
   * <p>
   * 123 出现了 2 次
   * <p>
   * 456 出现了 2 次
   * <p>
   * 789 出现了 1 次
   */
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    String str = "123,456,789,123,456";
    String[] s = str.split(",");
    for (int i = 0; i < s.length; i++) {
      if (!map.containsKey(s[i])) {
        map.put(s[i], 1);
      } else {
        map.put(s[i], map.get(s[i]) + 1);
      }
    }
    System.out.println("m= " + map);
    Set<Map.Entry<String, Integer>> s1 = map.entrySet();
    for (Map.Entry<String, Integer> me1 : s1) {
      System.out.println(me1.getKey() + "出现了" + me1.getValue() + "次！");
    }
  }
}
