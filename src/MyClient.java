
import java.net.*;
import java.io.*;


/**
 *@Author YSM
 *@Date 2019/4/7
 *@Description 客户端
 * 1、创建客户端 + 端口
 * 2、准备数据
 * 3、打包（发送的地点以及端口）
 * 4、发送数据
 * 5、释放资源
 */
public class MyClient {
   /* public static void  main(String[] args) throws IOException {
        //1、创建客户端 + 端口
        DatagramSocket client=new DatagramSocket(9998);
        String msg="udp编程";
        byte[] data=msg.getBytes();
        //打包（发送地点以及端口）
        DatagramPacket packet=new DatagramPacket(data, data.length, new InetSocketAddress("localhost",9999));
        //发送
        client.send(packet);
        //5、释放资源
        client.close();
    }*/

    //此函数用来创建一个服务器发送消息
    public void send()
    {
        try {
            //此字符串为要发送的消息
            String msg = new String("你好，服务端！");

            //创建一个服务器
            DatagramSocket socket = new DatagramSocket(null);

            //将消息放入包内，并指定目标IP地址和端口
            DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("192.168.4.197"),9999);
            try {
                //此函数将消息发送出去
                socket.send(packet);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (SocketException | UnknownHostException e) {
            // TODO Auto-generated catch block0.
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        MyClient s = new MyClient();
        s.send();
    }

}
