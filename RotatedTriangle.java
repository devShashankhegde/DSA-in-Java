
// Prints a right-angled triangle rotated to the right

public class RotatedTriangle {
    public static void main(String[] args) {
        int n = 4; // Height of the triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print spaces before stars
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
