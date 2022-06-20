// CRC Error checker with 1011 as the parity
import java.io.*;
import java.net.*;

public class server {
    public static String return_crc(String s) {
        int a[] = new int[s.length()];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s.charAt(i) + "");
        }

        for (int i = 0; i < n - 4; i++) {
            a[i] = (a[i] == 1) ? 0 : 1;
            a[i + 1] = (a[i + 1] == 1) ? 1 : 0;
            a[i + 2] = (a[i + 2] == 1) ? 0 : 1;
            a[i + 3] = (a[i + 3] == 1) ? 0 : 1;
        }
        String result = "";
        for (int i = n - 3; i < n; i++) {
            result = result + a[i];
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8000);
        while (true) {
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String receive = br.readLine();

            System.out.println(receive);

            String crc = return_crc(receive);

            String error_message = "";
            if (crc.equals("000")) {
                error_message = "No Error";
            } else {
                error_message = "Error";
            }

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeBytes(error_message + "\n");

            s.close();
        }
    }
}

