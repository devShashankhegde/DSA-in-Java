import java.util.Scanner;

public class ArrayPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        // Generate all possible unique pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
                count++;
            }
            System.out.println();
        }

        System.out.println("Total number of pairs: " + count);
    }
}
