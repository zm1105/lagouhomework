package onestage.secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/14 10:11
 */
public interface Internet {
  /**
   * 上网服务接口 抽象方法: 参数 1: 上网流量, 参数 2: 手机卡类对象 让上网套餐类实现上网服务接口。
   * @param flow
   * @param phone
   */
  public void surfing(int flow,Phone phone);
}
