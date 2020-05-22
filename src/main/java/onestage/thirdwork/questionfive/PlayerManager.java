package onestage.thirdwork.questionfive;

import java.util.ArrayList;

/**
 * @author : zhoumin
 * @data :  2020/5/22 14:35
 */
public class PlayerManager {
  public ArrayList<player> players = new ArrayList<>();
  public static final PlayerManager manager = new PlayerManager();

  public void show() {
    player player1 = new player(1, "张三");
    player player2 = new player(1, "李四");
    player player3 = new player(1, "王五");
    players.add(player1);
    players.add(player2);
    players.add(player3);


    for (player player : players) {
      System.out.println(player);
    }
  }
}


