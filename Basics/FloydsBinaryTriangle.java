
// Prints Floyd's Triangle with alternating 0s and 1s based on (i + j) % 2

public class FloydsBinaryTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if (i + j) is even, else 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
