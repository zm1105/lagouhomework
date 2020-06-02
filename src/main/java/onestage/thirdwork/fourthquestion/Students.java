package onestage.thirdwork.fourthquestion;

import onestage.fourthwork.FirstQuestion.ageException;
import onestage.fourthwork.FirstQuestion.idException;

import java.util.Objects;

/**
 * @author : zhoumin
 * @data :  2020/5/21 17:33
 */
public class Students {
  /**
   * 使用 List 集合实现简易的学生信息管理系统，要求打印字符界面提示用户选择相应的功能，
   * <p>
   * 其中学生的信息有：学号、姓名、年龄。
   */
  private String id;
  private String name;
  private int age;

  public Students() {
  }

  public Students(String id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) throws idException {
    if (Integer.valueOf(id) > 0) {
      this.id = id;
    }else {
      throw new idException("学号输入有误");
    }
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

  public void setAge(int age) throws ageException {
    if (age>0&&age<180){
    this.age = age;

    }else {
      throw new ageException("目前地球上没有这个人");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Students students = (Students) o;
    return age == students.age &&
        Objects.equals(id, students.id) &&
        Objects.equals(name, students.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age);
  }

  @Override
  public String toString() {
    return "Students{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
