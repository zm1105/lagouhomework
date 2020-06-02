package onestage.fourthwork.FirstQuestion;

/**
 * @author : zhoumin
 * @data :  2020/6/2 12:40
 */

/**
 * a.自定义学号异常类和年龄异常类，并在该成员变量不合理时产生异常对象并抛出。
 */
public class idException extends Exception {
  static final long serialVersionUID = -3387516993124229948L;

  public idException() {

  }

  public idException(String message) {
    super(message);
  }
}
