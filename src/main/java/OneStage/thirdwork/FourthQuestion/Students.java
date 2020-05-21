package OneStage.thirdwork.FourthQuestion;

/**
 * @author : zhoumin
 * @data :  2020/5/21 17:33
 */
public class Students {
  /**
   *使用 List 集合实现简易的学生信息管理系统，要求打印字符界面提示用户选择相应的功能，
   *
   * 其中学生的信息有：学号、姓名、年龄。
   */
  private int number;
  private String name;
  private int age;

  public Students() {
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Students(int number, String name, int age) {
    this.number = number;
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Students{" +
        "number=" + number +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
