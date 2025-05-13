import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a word
        String y = sc.next();
        System.out.println(y);

        // Check if the next token is a boolean (true/false)
        boolean b1 = sc.hasNextBoolean();
        System.out.println(b1);

        // Read another word and print the second character (index 1)
        char v = sc.next().charAt(1);
        System.out.println(v);

        sc.close();
    }
}
