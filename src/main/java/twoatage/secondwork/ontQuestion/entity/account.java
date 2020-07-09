package twoatage.secondwork.ontQuestion.entity;

import java.io.Serializable;

/**
 * @author : zhoumin
 * @data :  2020/7/8 16:32
 * 账户表
 */
public class account  implements Serializable {
  private static final long serialVersionUID = -990788530579435205L;
  private int id;
  private String username;
  private String card;
  /**余额*/
  private Double balance;

  public account() {
  }

  public account(int id, String username, String card, Double balance) {
    this.id = id;
    this.username = username;
    this.card = card;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "transferAccounts{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", card='" + card + '\'' +
        ", balance=" + balance +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }
}
