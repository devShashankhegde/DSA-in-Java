import java.util.Scanner;

public class StudentPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Percentage Calculator ===");
        System.out.println("Enter the marks (out of 100) for the following 6 subjects:");
        System.out.print("1. Mathematics: ");
        int m = sc.nextInt();
        System.out.print("2. Science: ");
        int s = sc.nextInt();
        System.out.print("3. Social Science: ");
        int sos = sc.nextInt();
        System.out.print("4. English: ");
        int e = sc.nextInt();
        System.out.print("5. Kannada: ");
        int k = sc.nextInt();
        System.out.print("6. Sankrit: ");
        int snk = sc.nextInt();

        // Check for failing marks
        if (m < 35 || s < 35 || sos < 35 || e < 35 || k < 35 || snk < 35) {
            System.out.println("\nResult: FAIL (F)");
        } else {
            System.out.println("\nResult: PASS (P)");
        }

        // Calculate percentage
        float per = (m + s + sos + k + e + snk) / 6.0f; // use float division

        System.out.printf("Percentage: %.2f%%\n", per); // limit to 2 decimal places

        // Grade calculation based on percentage
        System.out.print("Grade: ");
        if (per >= 90) {
            System.out.println("O");
        } else if (per >= 80) {
            System.out.println("A");
        } else if (per >= 70) {
            System.out.println("B");
        } else if (per >= 35) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}
