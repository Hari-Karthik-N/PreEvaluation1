//14.If the given string length is odd print the pattern below otherwise print 0. (7 minutes)
//        p      M
//         R    A
//          O  R
//            G
//          O  R
//         R    A
//        P      M.
import java.util.Scanner;
public class XPatternPrinting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String ip = inp.next();
        for(int i = 0;i<ip.length();i++) {
            for(int j = 0;j<ip.length();j++) {
                if(i==j) {
                    System.out.print(ip.charAt(i));
                }
                else if((i+j) == (ip.length()-1)) {
                    System.out.print(ip.charAt(j));
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        inp.close();
    }
}