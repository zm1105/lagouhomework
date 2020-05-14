package secondwork.mobilephone;

import org.junit.jupiter.api.Test;

/**
 * @author : zhoumin
 * @data :  2020/5/13 17:40
 */
public class MobileTest {

  @Test
  public void phonecardEnumTest() {

    phoneCardEnum.enumTest(phoneCardEnum.Bigcard);
    phoneCardEnum[] values = phoneCardEnum.values();
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
      System.out.println(values[i].ordinal());
    }
  }

  @Test
  /**
   * 上网套餐类
   */
  public void onlinePackageTest() {
    OnlinePackage onlinePackage = new OnlinePackage(2, 6);
    onlinePackage.showCallPackage();
    System.out.println("-----------");
    OnlinePackage onlinePackage1 = new OnlinePackage();
    onlinePackage.surfing(5,new Phone("x", 10, "zhangsan", 20,
        22, 2, 20));


  }

  @Test
  /**
   * 通话套餐
   */
  public void callPackageTest() {
    CallPackageImpl callPackage = new CallPackageImpl();
    callPackage.setPostage(10);
    callPackage.setTalkTime(5);
    callPackage.setMessageNumber(20);
    callPackage.showCallPackage();
    System.out.println("----------------");
    CallPackageImpl callPackage1 = new CallPackageImpl();
    callPackage1.conversation(20, new Phone("x", 10, "zhangsan", 20,
        22, 2, 20));
  }
}
