import java.net.*;

public class DatagramReceiverDemo {
    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);

        DatagramSocket ds = new DatagramSocket(3000);
        ds.receive(dp);

        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);

        ds.close();
    }
}