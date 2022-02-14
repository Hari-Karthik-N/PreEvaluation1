//15. Input: aaabbbbccad
//        Output: a3b4c2a1d1
//        (7 minutes)
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String userInput = input.next();
        String ans = "";
        int count = 1;
        for(int i = 0; i < userInput.length()-1; i++) {
            if(userInput.charAt(i) == userInput.charAt(i+1)) {
                count++;
            } else {
                ans += userInput.charAt(i) + "" + count;
                count = 1;
            }
        }
        ans += userInput.charAt(userInput.length()-1) + "" + count;
        System.out.println("the ans: " + ans);
    }
}
