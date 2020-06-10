package onestage.fifthwork.ExamSystemClent.dao;

import java.io.Serializable;

/**
 * @author : zhoumin
 * @data :  2020/6/9 14:55
 */
public class User implements Serializable {
  private static final long serialVersionUID = 2565436914051733677L;
  private String userName;
  private String passWord;

  public User(String userName, String passWord) {
    this.userName = userName;
    this.passWord = passWord;
  }

  public User() {
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  @Override
  public String toString() {
    return "User{" +
        "userName='" + userName + '\'' +
        ", passWord='" + passWord + '\'' +
        '}';
  }
}
