package onestage.thirdwork.questionfive;

/**
 * @author : zhoumin
 * @data :  2020/5/22 13:22
 */
public class test {
  public static void main(String[] args) {

    // 1、创建扑克牌
    poker poker = new poker();
    poker.washPoke(poker.createPoker());
    // 2、创建两个玩家
    PlayerManager playerManager = new PlayerManager();
    playerManager.show();
    // 4、 发牌
    //todo 发牌存在问题，需要修改
    mange mange = new mange();
    mange.showPork(poker.createPoker());
  }
}
