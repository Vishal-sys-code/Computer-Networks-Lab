import java.io.*;
import java.net.*;

public class server {
    public static void main(String ars[]) throws Exception {
        ServerSocket ss = new ServerSocket(8000);
        while (true) {
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String message = br.readLine();
            System.out.println(message);

            String ack = "Acknowledgement";
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeBytes(ack + "\n");

            s.close();
        }
    }
}