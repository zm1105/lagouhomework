package onestage.fifthwork.ExamSystemSever;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : zhoumin
 * @data :  2020/6/9 11:11
 */
public class serverInitClose {
  private ServerSocket ss;
  private Socket s;
  private ObjectInputStream ois;
  private ObjectOutputStream oos;

  public ObjectInputStream getOis() {
    return ois;
  }

  public ObjectOutputStream getOos() {
    return oos;
  }



  /**
   * 服务器初始化和关闭
   */
  public void severinit() throws IOException {
    ss = new ServerSocket(9999);
    System.out.println("等待客户端连接。。。");
    s = ss.accept();
    System.out.println("客户端连接成功");

    ois = new ObjectInputStream(s.getInputStream());
    oos = new ObjectOutputStream(s.getOutputStream());
    System.out.println("服务器初始化成功");
  }

  public void severclose() throws IOException {
    oos.close();
    ois.close();
    s.close();
    ss.close();
    System.out.println("服务器关闭成功");
  }
}
