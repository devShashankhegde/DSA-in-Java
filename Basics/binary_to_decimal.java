import java.util.Scanner;

public class binary_to_decimal {

    // Converts binary (as int) to decimal
    public static void btod(int n) {
        int deci = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 10;
            deci += (int) Math.pow(2, i) * r;
            n /= 10;
            i++;
        }
        System.out.println("Decimal is " + deci);
    }

    // Converts decimal to binary (as int)
    public static void dtob(int n) {
        int bin = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 2;
            bin += r * (int) Math.pow(10, i);
            n /= 2;
            i++;
        }
        System.out.println("Binary is " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Enter choice:\n1. Binary to Decimal\n2. Decimal to Binary");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Binary to Decimal");
                btod(n);
                break;
            case 2:
                System.out.println("Decimal to Binary");
                dtob(n);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
