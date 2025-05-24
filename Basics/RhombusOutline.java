// RhombusOutline.java
// Prints an outlined rhombus pattern with stars

public class RhombusOutline {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("  ");
            }

            // Print stars and spaces for rhombus outline
            for (int k = 0; k < 5; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
