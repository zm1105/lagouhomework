package twoatage.secondwork.twoQuestion.entity;

/**
 * @author : zhoumin
 * @data :  2020/7/10 10:11
 * `id` int(11) NOT NULL AUTO_INCREMENT,
 * `pname` varchar(20) DEFAULT NULL,
 * `price` double DEFAULT NULL,
 * `prodate` date DEFAULT NULL,
 * `color` varchar(20) DEFAULT NULL,
 */
public class phone {
  private int id;
  private String pname;
  private String price;
  private String color;
  private String prodate;

  public phone(int id, String pname, String price, String prodae, String color, String prodate) {
    this.id = id;
    this.pname = pname;
    this.price = price;
    this.color = color;
    this.prodate = prodate;
  }

  @Override
  public String toString() {
    return "phone{" +
        "id=" + id +
        ", pname='" + pname + '\'' +
        ", price='" + price + '\'' +
        ", color='" + color + '\'' +
        ", prodate='" + prodate + '\'' +
        '}';
  }

  public phone() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getProdate() {
    return prodate;
  }

  public void setProdate(String prodate) {
    this.prodate = prodate;
  }
}
