package OneStage.secondwork.mobilephone;

import java.util.Objects;

/**
 * @author : zhoumin
 * @data :  2020/5/13 14:50
 */
public class Phone {
  /**
   * （1）手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 ）
   */

  private String mobileCard;
  private int cardNumber;
  private String userName;
  private int passWord;
  private int accountBalance;
  private int talkTime;
  private int flow;

  public Phone() {
  }

  public Phone(String mobileCard, int cardNumber, String userName, int passWord, int accountBalance, int talkTime, int flow) {
    setMobileCard(mobileCard);
    setCardNumber(cardNumber);
    setUserName(userName);
    setPassWord(passWord);
    setAccountBalance(accountBalance);
    setTalkTime(talkTime);
    setFlow(flow);
  }

  public String getMobileCard() {
    return mobileCard;
  }

  public void setMobileCard(String mobileCard) {
    this.mobileCard = mobileCard;
  }

  public int getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(int cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getPassWord() {
    return passWord;
  }

  public void setPassWord(int passWord) {
    this.passWord = passWord;
  }

  public int getAccountBalance() {
    if (accountBalance > 0) {
    }
    return accountBalance;
  }

  public void setAccountBalance(int accountBalance) {
    if (accountBalance > 0) {
      this.accountBalance = accountBalance;
    } else {
      System.out.println("您已欠费");
    }
  }

  public int getTalkTime() {
    return talkTime;
  }

  public void setTalkTime(int talkTime) {
    if (talkTime > 0) {
      this.talkTime = talkTime;
    } else {
      System.out.println("请使用地球维度时间");
    }
  }

  public int getFlow() {
    return flow;
  }

  public void setFlow(int flow) {
    if (flow > 0) {
      this.flow = flow;
    } else {
      System.out.println("没有找到该流量套餐。。。");
    }
  }

  /**
   * 行为：显示  卡号 + 用户名 + 当前余额
   */
  public void phoneCardShow(int cardNumber, String userName, int accountBalance) {
    System.out.println("卡号是" + getCardNumber() + "用户名是" + getUserName() + "当前余额" + getAccountBalance());
  }

  @Override
  public String toString() {
    return "Phone{" +
        "mobileCard='" + mobileCard + '\'' +
        ", cardNumber=" + cardNumber +
        ", userName='" + userName + '\'' +
        ", passWord=" + passWord +
        ", accountBalance=" + accountBalance +
        ", talkTime=" + talkTime +
        ", flow=" + flow +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return cardNumber == phone.cardNumber &&
        passWord == phone.passWord &&
        accountBalance == phone.accountBalance &&
        talkTime == phone.talkTime &&
        flow == phone.flow &&
        Objects.equals(mobileCard, phone.mobileCard) &&
        Objects.equals(userName, phone.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileCard, cardNumber, userName, passWord, accountBalance, talkTime, flow);
  }
}
