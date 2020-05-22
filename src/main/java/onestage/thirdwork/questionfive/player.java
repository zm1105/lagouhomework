package onestage.thirdwork.questionfive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/5/22 13:50
 */
public class player {
  private int id;
  private String name;
  private List<poker> pokers = new ArrayList<>();

  public player() {
  }

  public player(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<poker> getPokers() {
    return pokers;
  }

  public void setPokers(List<poker> pokers) {
    this.pokers = pokers;
  }

  @Override
  public String toString() {
    return "player{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", pokers=" + pokers +
        '}';
  }

}
