package secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/13 15:14
 */
public class OnlinePackage extends BaseMobilePackage implements Internet {
  /**
   * 上网套餐类 特征：上网流量  行为：
   */
  private int flow;


  public OnlinePackage() {
  }

  @Override
  public void showCallPackage() {
    System.out.println("上网流量" + getFlow() + "M，" + "资费是" + getPostage() + "元");

  }

  public OnlinePackage(int flow, int postage) {
    setFlow(flow);
    setPostage(postage);

  }

  public int getFlow() {
    return flow;
  }

  public void setFlow(int flow) {
    if (flow > 0) {
      this.flow = flow;
    } else {
      System.out.println("没有找到您需要的流量套餐");
    }
  }

  public void surfing(int flow, Phone phone) {
    System.out.println(flow);
    System.out.println(phone.toString());
    phone.phoneCardShow(phone.getCardNumber(),phone.getUserName(),phone.getAccountBalance());
  }
}
