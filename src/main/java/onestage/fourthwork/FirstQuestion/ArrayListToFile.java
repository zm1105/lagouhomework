package onestage.fourthwork.FirstQuestion;

import onestage.thirdwork.fourthquestion.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/6/2 13:22
 */
public class ArrayListToFile {
  public static List<Students> array = new ArrayList<>();

  public void write(ArrayList<Students> list) throws IOException {
    BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\array.txt"));
    for (int x = 0; x < list.size(); x++) {
      Students students = list.get(x);
      bf.write(String.valueOf(students));
      bf.newLine();
      bf.flush();
    }
    //释放资源
    bf.close();
  }

  public List<Students> read() throws IOException, ageException {
    BufferedReader br = null;
    File file = new File("D:\\array.txt");
    if (!file.exists()) {
      file.createNewFile();
    }

    try {
      br = new BufferedReader(new FileReader(file));
      // 读取数据存储到集合中
      String line;
      while ((line = br.readLine()) != null) {
        line = line.replace("'", "");
        String[] split = line.substring(line.indexOf('{') + 1, line.indexOf('}')).split(",");
        //创建学生对象
        Students s = new Students();
        //把字符串中的每一个元素取出来对应的赋值给学生对象的成员比变量
        s.setId(split[0].trim().split("=")[1]);
        s.setName(split[1].trim().split("=")[1]);
        s.setAge(Integer.parseInt(split[2].trim().split("=")[1]));
        //把学生对象添加到集合中
        array.add(s);
      }

    } catch (IOException | idException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        // 释放资源
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return array;
  }
}
