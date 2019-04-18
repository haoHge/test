

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
public class test {

    public static void  main(String[] args) throws IOException {
        //1、创建客户端 + 端口
        DatagramSocket client=new DatagramSocket(9998);
        String msg="udp编程";
        byte[] data=msg.getBytes();
        //打包（发送地点以及端口）
        DatagramPacket packet=new DatagramPacket(data, data.length, new InetSocketAddress("192.168.4.197",9999));
        //发送
        client.send(packet);
        //5、释放资源
        client.close();
    }

}
