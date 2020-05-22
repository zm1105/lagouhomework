package onestage.secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/13 15:18
 */
public class UserConsumption {
  /**
   * 用户消费信息类 特征：统计通话时长、统计上网流量、每月消费金额
   */
  private int talkTime;
  private int flow;
  private int consumptionAmount;

  public UserConsumption(int talkTime, int flow, int consumptionAmount) {
    this.talkTime = talkTime;
    this.flow = flow;
    this.consumptionAmount = consumptionAmount;
  }

  public UserConsumption() {
  }

  public int getTalkTime() {
    return talkTime;
  }

  public void setTalkTime(int talkTime) {
    this.talkTime = talkTime;
  }

  public int getFlow() {
    return flow;
  }

  public void setFlow(int flow) {
    this.flow = flow;
  }

  public int getConsumptionAmount() {
    return consumptionAmount;
  }

  public void setConsumptionAmount(int consumptionAmount) {
    this.consumptionAmount = consumptionAmount;
  }
}
