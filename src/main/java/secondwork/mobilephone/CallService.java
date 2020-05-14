package secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/14 10:05
 */
public interface CallService {
  /**
   * 通话服务接口 抽象方法: 参数 1: 通话分钟, 参数 2: 手机卡类对象 让通话套餐类实现通话服务接口。
   *
   * @param talkTime
   * @param phone
   */
  public void conversation(int talkTime, Phone phone);
}
