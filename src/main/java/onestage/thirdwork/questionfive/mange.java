package onestage.thirdwork.questionfive;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author : zhoumin
 * @data :  2020/5/22 13:37
 */
public class mange {
  //发牌
  public Map<String, player> pushPoker(List<poker> listCard, Map<String, player> pMap){
    System.out.println("**********发牌开始**********");
    int control = 0;
    for (Map.Entry<String, player> entry : pMap.entrySet()) {

      if (control == 0) {
        for (int i = 0; i < 3; i = i + 2) {
          // 发牌
          entry.getValue().getPokers().add(listCard.get(i));
        }
        // 更新map对象
        pMap.put(entry.getKey(), entry.getValue());
        control++;
      } else if (control == 1) {
        for (int i = 1; i < 4; i = i + 2) {
          // 发牌
          entry.getValue().getPokers().add(listCard.get(i));
        }
        // 更新map对象
        pMap.put(entry.getKey(), entry.getValue());
        control++;
      } else {
        break;
      }
    }

    System.out.println("**********发牌成功**********");

    return pMap;

  }

  public void showPork(List<poker> it) {
    System.out.print("为:[");
    Iterator iterator1 = it.iterator();
    while (iterator1.hasNext()) {
      System.out.print(iterator1.next() + ",");
    }
    System.out.println("]");
  }
}