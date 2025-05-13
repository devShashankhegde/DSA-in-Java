import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String str = sc.nextLine();

        System.out.println("Hello " + str + ", good afternoon");

        String snk = new String("shashank sak");
        System.out.println(snk);

        sc.close();
    }
}
