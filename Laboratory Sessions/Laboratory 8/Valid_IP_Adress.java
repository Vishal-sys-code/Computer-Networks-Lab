import java.util.*;

//Find the Validity of a given IP address , find the class and also find the Network address.
class Valid_IP_Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Enter the IP address:");
        s = sc.next();
        StringTokenizer str = new StringTokenizer(s, ".");
        int[] a = new int[4];
        int c = str.countTokens();
        int flag = 0;
        if (c == 4) {
            for (int i = 0; i < 4; i++)
                a[i] = Integer.parseInt(str.nextToken());

            for (int i = 0; i < 4; i++) {
                if (a[i] < 0 || a[i] > 255) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("INVALID IP");
            if (a[0] <= 127)
                System.out.println("CLASS A\n");
            else if (a[0] >= 128 && a[0] <= 191)
                System.out.println("CLASS B\n");
            else if (a[0] >= 192 && a[0] <= 223)
                System.out.println("CLASS C\n");
        } 
        else{
            System.out.println("INVALID IP");
        }
        sc.close();
    }
}