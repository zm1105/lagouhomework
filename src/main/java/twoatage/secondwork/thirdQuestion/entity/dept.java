package twoatage.secondwork.thirdQuestion.entity;

/**
 * @author : zhoumin
 * @data :  2020/7/10 14:53
 */
public class dept {
  private int id;
  private String deptname;

  public dept() {
  }

  public dept(int id, String deptname) {
    this.id = id;
    this.deptname = deptname;
  }

  @Override
  public String toString() {
    return "dept{" +
        "id=" + id +
        ", deptname='" + deptname + '\'' +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDeptname() {
    return deptname;
  }

  public void setDeptname(String deptname) {
    this.deptname = deptname;
  }
}
