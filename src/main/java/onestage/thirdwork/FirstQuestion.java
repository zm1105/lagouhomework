package onestage.thirdwork;

/**
 * @author : zhoumin
 * @data :  2020/5/20 16:52
 */
public class FirstQuestion {
  /**
   * 编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打 印出来。
   */
  public static void main(String[] args) {
    String str = "ABCD123!@#$%ab";
    int bigCount = 0;
    int smallCount = 0;
    int numCount = 0;
    for (int i = 0; i < str.length(); i++) {
      char chs = str.charAt(i);
      if (chs >= 'A' && chs <= 'Z') {
        bigCount++;
      } else if (chs >= 'a' && chs <= 'z') {
        smallCount++;
      } else if (chs >= '0' && chs <= '9') {
        numCount++;
      }
    }
    System.out.println("str中的大写字母有：" + bigCount + "个");
    System.out.println("str中的小写字母有：" + smallCount + "个");
    System.out.println("str中的数字有：" + numCount + "个");
  }
}
