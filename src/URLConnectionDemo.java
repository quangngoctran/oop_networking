import java.io.*;
import java.net.*;

public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.rmit.edu.vn/");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i = stream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = stream.read();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
