package onestage.secondwork.mobilephone;

/**
 * @author : zhoumin
 * @data :  2020/5/14 9:19
 */
public abstract class BaseMobilePackage {
  /**
   * 实体类的优化 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。
   */
  private int postage;

  public BaseMobilePackage() {
  }

  public BaseMobilePackage(int postage) {
    setPostage(postage);
  }

  public int getPostage() {
    return postage;
  }

  public void setPostage(int postage) {
    if (postage > 0) {
      this.postage = postage;
    } else {
      System.out.println("没有找到合适您的资费");
    }
  }

  /**
   * 显示所有套餐信息
   */
  public abstract void showCallPackage();
}
