// Write a program to find the hostname and the ip-address of the local machine

import java.net.*;

class Host_Local_IP_Address{
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        String host = ip.getHostName();
        System.out.println("HostName: " + host);
        System.out.println("IP: " + ip);
    }
}


/* 
    Output: 
        HostName:  1defacb52e61
        IP Address:  172.28.0.2
*/ 