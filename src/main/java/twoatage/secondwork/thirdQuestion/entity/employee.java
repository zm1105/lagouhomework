package twoatage.secondwork.thirdQuestion.entity;

/**
 * @author : zhoumin
 * @data :  2020/7/10 14:54
 * `id` int(11) NOT NULL AUTO_INCREMENT,
 * `NAME` varchar(30) DEFAULT NULL,
 * `age` double DEFAULT NULL,
 * `sex` varchar(6) DEFAULT NULL,
 * `salary` double DEFAULT NULL,
 * `empdate` date DEFAULT NULL,
 * `did` int(11) DEFAULT NULL,
 */
public class employee {
  private int id;
  private String NAME;
  private Double age;
  private String sex;
  private String salary;
  private String empdate;
  private int did;

  private dept dept;

  @Override
  public String toString() {
    return "employee{" +
        "id=" + id +
        ", NAME='" + NAME + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        ", salary='" + salary + '\'' +
        ", empdate='" + empdate + '\'' +
        ", did=" + did +
        ", dept=" + dept +
        '}';
  }

  public employee() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public Double getAge() {
    return age;
  }

  public void setAge(Double age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public String getEmpdate() {
    return empdate;
  }

  public void setEmpdate(String empdate) {
    this.empdate = empdate;
  }

  public int getDid() {
    return did;
  }

  public void setDid(int did) {
    this.did = did;
  }

  public twoatage.secondwork.thirdQuestion.entity.dept getDept() {
    return dept;
  }

  public void setDept(twoatage.secondwork.thirdQuestion.entity.dept dept) {
    this.dept = dept;
  }

  public employee(int id, String NAME, Double age, String sex, String salary, String empdate, int did, twoatage.secondwork.thirdQuestion.entity.dept dept) {
    this.id = id;
    this.NAME = NAME;
    this.age = age;
    this.sex = sex;
    this.salary = salary;
    this.empdate = empdate;
    this.did = did;
    this.dept = dept;
  }
}