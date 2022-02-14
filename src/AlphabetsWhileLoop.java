//17.print all alphabets from a to z. - using while loop. (2 minutes)
public class AlphabetsWhileLoop {
    public static void main(String[] args) {
        char current = 'a';
        while(current != 'z') {
            System.out.print(current + " ");
            current++;
        }
    }
}
