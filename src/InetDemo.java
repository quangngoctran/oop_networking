import java.net.*;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.rmit.edu.vn");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + local.getHostName());
            System.out.println("Local Host IP Address: " + local.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  