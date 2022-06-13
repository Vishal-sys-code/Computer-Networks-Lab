// package Laboratory Sessions.Laboratory 2;

import java.net.*;

public class Host_Remote_IP_Address {
    public static void main(String[] args) throws Exception{
        String hostName = "www.google.com";
        InetAddress ip = InetAddress.getByName(hostName);
        System.out.println("Remote IP Address: " + ip);
    }
}
