package OneStage.secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/13 15:00
 */
public class CallPackageImpl extends BaseMobilePackage implements CallService {
  /**
   * 通话套餐类 特征：通话时长、短信条数
   */
  private int talkTime;
  private int messageNumber;

  public CallPackageImpl() {
  }


  /**
   * 行为: 显示所有套餐信息
   */
  @Override
  public void showCallPackage() {
    System.out.println("通话时长" + getTalkTime() + "分钟，" + "短信条数" + getMessageNumber() + "条，" + "每月资费" +
        getPostage() + "元");

  }

  public CallPackageImpl(int talkTime, int messageNumber, int postage) {
    setTalkTime(talkTime);
    setMessageNumber(messageNumber);
    setPostage(postage);
  }

  public int getTalkTime() {
    return talkTime;
  }

  public void setTalkTime(int talkTime) {
    this.talkTime = talkTime;
  }

  public int getMessageNumber() {
    return messageNumber;
  }

  public void setMessageNumber(int messageNumber) {
    this.messageNumber = messageNumber;
  }

  public void conversation(int talkTime, Phone phone) {
    phone.phoneCardShow(phone.getCardNumber(), phone.getUserName(), phone.getAccountBalance());
    System.out.println(phone.toString());
    System.out.println(talkTime);

  }
}
