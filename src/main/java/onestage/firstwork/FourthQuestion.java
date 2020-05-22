package onestage.firstwork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/3 18:58
 */
public class FourthQuestion {
  /**
   * 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，
   * 数组进行扩容，容量从 10 变 15
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("请输入第" + i + "个数");
      arr[i] = scanner.nextInt();
      if (i * 1.0 / arr.length >= 0.8) {
        int[] newarr = new int[(int) (arr.length * 1.5)];
        arr = newarr;
        System.out.println("新数组的长度为" + arr.length);
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}

