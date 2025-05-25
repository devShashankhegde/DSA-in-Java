import java.util.Scanner;

public class checkeven {

    // Returns true if the number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
