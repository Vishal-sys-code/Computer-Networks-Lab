// CRC Error checker with 1011 as the parity
import java.io.*;
import java.net.*;

public class client {
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String z = num + "000";
        String crc = return_crc(z);

        String sending_message = num + crc;
        Socket s = new Socket("LocalHost", 8000);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeBytes(sending_message + "\n");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String zz = br1.readLine();
        System.out.println(zz);

        s.close();
    }
}
