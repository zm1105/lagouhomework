package twoatage.secondwork.ontQuestion.entity;

import java.io.Serializable;

/**
 * @author : zhoumin
 * @data :  2020/7/8 16:38
 * 交易记录表
 */
public class transaction implements Serializable {
  private static final long serialVersionUID = 5994625048926536155L;

  private int id;
  private String cardid;
  /**0 转入   1 转出*/
  private String tratype;

  private Double tramoney;
  private String tradate;

  public transaction(int id, String cardid, String tratype, Double tramoney, String tradate) {
    this.id = id;
    //卡号
    this.cardid = cardid;
    //交易类型： 转入 或者 转出
    this.tratype = tratype;
    //交易金额
    this.tramoney = tramoney;
    //交易日期
    this.tradate = tradate;
  }

  public transaction() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCardid() {
    return cardid;
  }

  public void setCardid(String cardid) {
    this.cardid = cardid;
  }

  public String getTratype() {
    return tratype;
  }

  public void setTratype(String tratype) {
    this.tratype = tratype;
  }

  public Double getTramoney() {
    return tramoney;
  }

  public void setTramoney(Double tramoney) {
    this.tramoney = tramoney;
  }

  public String getTradate() {
    return tradate;
  }

  public void setTradate(String tradate) {
    this.tradate = tradate;
  }

  @Override
  public String toString() {
    return "transaction{" +
        "id=" + id +
        ", cardid='" + cardid + '\'' +
        ", tratype='" + tratype + '\'' +
        ", tramoney=" + tramoney +
        ", tradate='" + tradate + '\'' +
        '}';
  }
}
