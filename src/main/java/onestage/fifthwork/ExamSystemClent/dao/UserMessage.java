package onestage.fifthwork.ExamSystemClent.dao;

import java.io.Serializable;

/**
 * @author : zhoumin
 * @data :  2020/6/9 15:00
 */
public class UserMessage implements Serializable {
  private static final long serialVersionUID = -259143920692568275L;
  private String type;
  private User user;

  public UserMessage() {
  }

  public UserMessage(String type, User user) {
    this.type = type;
    this.user = user;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "UserMessage{" +
        "type='" + type + '\'' +
        ", user=" + user +
        '}';
  }
}
