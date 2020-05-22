package onestage.firstwork;

import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/5/3 16:03
 */
public class FirstQuestion {
  //提示用户输入年月日信息，判断这一天是这一年中的第几天并打印
  public static void main(String[] args) {
    int[] leapYear = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};//闰年
    int[] commonYear = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};//平年

    System.out.println("请输入需要判断的日期");
    Scanner scanner = new Scanner(System.in);
    int date = scanner.nextInt();
    int year = date / 10000;
    int month = date % 10000 / 100;
    int day = date % 100;
    int sumDays = 0;
    if (month < 0 || month > 12) {
      System.out.println("输入的月份不合法，请重新输入");
    } else {
      //判断是否为闰年
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        if (month == 1 || month == 3 || month == 5 || month == 7
            || month == 8 || month == 10 || month == 12) {
          if (day < 0 || day > 31) {
            System.out.println("请输入正确的天数");
          } else {
            sumDays = leapYear[month - 1] + day;
          }
        } else if (month == 2) {
          if (day < 0 || day > 28) {
            System.out.println("输入的天数不合法，请输入正确的天数");
          } else {
            sumDays = leapYear[month - 1] + day;
          }
        } else {
          if (day < 1 || day > 30) {
            System.out.println("请输入正确的天数!");
          } else {
            sumDays = leapYear[month - 1] + day;
          }
        }
      } else {
        if (month == 1 || month == 3 || month == 5 || month == 7
            || month == 8 || month == 10 || month == 12) {
          //判断天数是否在31天之内
          if (day < 1 || day > 31) {
            System.out.println("请输入正确的天数!");
          } else {
            sumDays = commonYear[month - 1] + day;
          }
        } else if (month == 2) {
          //判断天数是否在29天之内
          if (day < 1 || day > 29) {
            System.out.println("请输入正确的天数!");
          } else {
            sumDays = commonYear[month - 1] + day;
          }
        } else {
          //为4、6、9、11月中的一月
          //判断天数是否在30天之内
          if (day < 1 || day > 30) {
            System.out.println("请输入正确的天数!");
          } else {
            sumDays = commonYear[month - 1] + day;
          }
        }
      }
      System.out.println("年份是" + year + "月份是" + month + "天是" + day);
      System.out.println("这一天是第" + sumDays + "天");
    }
  }
}



