import java.util.*;

public class LinearSearch {

    // Function to perform linear search
    public static int lin(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int k = sc.nextInt();

        int result = lin(a, k);

        if (result == -1) {
            System.out.println("Key " + k + " not found.");
        } else {
            System.out.println("Key " + k + " found at index " + result + ".");
        }
    }
}
