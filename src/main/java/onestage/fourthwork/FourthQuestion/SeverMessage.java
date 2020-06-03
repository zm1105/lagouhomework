package onestage.fourthwork.FourthQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : zhoumin
 * @data :  2020/6/3 8:39
 */

/**
 * 服 务 器接 收到 对象 后判 断 用户 对象 信息 是否 为 "admin" 和 "123456"，
 * 若 是则 将 UserMessage 对象中的类型改为"success"，
 * 否则将类型改为"fail"并回发给客户端，客户 端接收到服务器发来的对象后判断并给出登录成功或者失败的提示。
 */
public class SeverMessage {
  public static void main(String[] args) {
    BufferedReader bf = null;
    ServerSocket serverSocket = null;
    Socket accept = null;
    PrintStream p = null;

    try {
      serverSocket = new ServerSocket(9080);
      accept = serverSocket.accept();
      System.out.println("客户端连接成功");
      bf = new BufferedReader(new InputStreamReader(accept.getInputStream()));
      p = new PrintStream(accept.getOutputStream());
      String line = null;


      while (true) {
        String s = bf.readLine();
        if (null != s) {
          System.out.println("客户端发送的消息是" + s);
          line = s.replace("'", "");
          String[] split = line.substring(line.indexOf('{') + 1, line.indexOf('}')).split(",");
          String name = split[0].trim().split("=")[1];
          String password = split[1].trim().split("=")[1];
          if (name.equals("admin") && password.equals("123456")) {
            p.println("登录成功");
          } else {
            p.println("账号或密码错误");
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (null != accept) {
        try {
          accept.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (null != bf) {
        try {
          bf.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (null != serverSocket) {
        try {
          serverSocket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }


  }
}



