package onestage.fifthwork.ExamSystemClent.util;

import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/6/9 14:39
 */
public class clientScanner {
  private static Scanner scanner = new Scanner(System.in);

  public static Scanner getScanner() {
    return scanner;
  }
  public static void closeScanner(){
    scanner.close();
  }
}
