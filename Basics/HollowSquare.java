import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j != 1 && j != n && i != 0 && i != n - 1)
                    System.out.print("   ");
                else
                    System.out.print(j + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
