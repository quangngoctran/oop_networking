import java.net.*;

public class DatagramSenderDemo {
    public static void main(String[] args) throws Exception {
        String str = "Welcome to Java";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);

        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
        ds.close();
    }
}