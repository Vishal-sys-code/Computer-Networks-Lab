import java.io.*;
import java.net.*;

public class client {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Message");
        String message = br.readLine();

        Socket s = new Socket("LocalHost", 8000);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeBytes(message + "\n");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String ack = br1.readLine();
        System.out.println(ack);

        s.close();
    }
}