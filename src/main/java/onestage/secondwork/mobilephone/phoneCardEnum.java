package onestage.secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/13 16:53
 */
public enum phoneCardEnum {
  /**
   * 设计和实现以下枚举类 手机卡的类型总共有 3 种：大卡、小卡、微型卡
   */
  Bigcard("大卡"), Smallcard("小卡"), miniatureCard("微型卡");

  private final String cardCategory;


  private phoneCardEnum(String cardCategory) {
    this.cardCategory = cardCategory;
  }

  public String getCardCategory() {
    return cardCategory;
  }
  public static void enumTest(phoneCardEnum pc){
     switch (pc){
       case Bigcard:
         System.out.println("这是大卡");break;
       case Smallcard:
         System.out.println("这是小卡");break;
       case miniatureCard:
         System.out.println("这是微型卡");break;
         default:
           System.out.println("没有这种卡");
     }
  }
}
