package onestage.fifthwork.ExamSystemClent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author : zhoumin
 * @data :  2020/6/9 11:32
 */
public class clientInitClose {
  private Socket socket;
  private ObjectOutputStream oos;
  private  ObjectInputStream ois;

  public ObjectOutputStream getOos() {
    return oos;
  }

  public ObjectInputStream getOis() {
    return ois;
  }


  public void clientInit() throws IOException {
     socket = new Socket(InetAddress.getLocalHost(),9999);
     oos = new ObjectOutputStream(socket.getOutputStream());
     ois =new ObjectInputStream(socket.getInputStream());
    System.out.println("连接服务器成功");
  }

  public void clientClose() throws IOException {
    ois.close();
    oos.close();
    socket.close();
    System.out.println("客户端关闭成功");

  }
}
