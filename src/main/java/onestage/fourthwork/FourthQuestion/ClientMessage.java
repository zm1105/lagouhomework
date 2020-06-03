package onestage.fourthwork.FourthQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author : zhoumin
 * @data :  2020/6/3 8:46
 */
public class ClientMessage {
  public static void main(String[] args) {
    Socket socket = null;
    Scanner sc = null;
    PrintStream p = null;
    User user = null;
    BufferedReader bufferedReader = null;
    try {
      socket = new Socket("127.0.0.1", 9080);
      System.out.println("连接服务器成功");
      Thread.sleep(1000);
      p = new PrintStream(socket.getOutputStream());
      sc = new Scanner(System.in);
      user = new User();
      bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      while (true) {
        System.out.println("请输入账号");
        user.setName(sc.nextLine());
        System.out.println("请输入密码");
        user.setPassword(sc.nextLine());
        p.println(user);
        String s = bufferedReader.readLine();
        if (s.equals("登录成功")) {
          System.out.println(s);
          break;
        }else{
          System.out.println(s);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      if (null != socket) {
        try {
          socket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (null != p) {
        p.close();
      }
      if (null != sc) {
        sc.close();
      }
    }
  }
}
