package onestage.thirdwork;

/**
 * @author : zhoumin
 * @data :  2020/5/20 17:06
 */
public class SecondQuestion {
  /**
   * 编程获取两个指定字符串中的最大相同子串。
   * *
   * 如： s1="asdafghjka", s2="aaasdfg" 他们的最大子串为"asd"
   * <p>
   * 提示： 将短的那个串进行长度依次递减的子串与较长的串比较。
   */
  public static void main(String[] args) {
    System.out.println(SecondQuestion.test());
  }


  private static String test() {
    String s1 = "asdafghjka";
    String s2 = "aaasdfg";
    String max = "";
    String min = "";
    max = (s1.length() > s2.length()) ? s1 : s2;
    min = (s1 == max) ? s2 : s1;

    for (int x = 0; x < min.length(); x++) {
      for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {
        String temp = min.substring(y, z);
        if (max.contains(temp)) {
          return temp;
        }
      }
    }
    return "没有相同的字符串";
  }
}




