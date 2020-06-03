package onestage.fourthwork.FourthQuestion;

/**
 * @author : zhoumin
 * @data :  2020/6/3 8:36
 */
public class UserMessage {
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
