// Demonstrates Java function with pass-by-value behavior

public class SwapFunctionDemo {

    // Function to swap two numbers (pass-by-value)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap -> a = " + a + "\t b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("Function to swap 2 numbers:");
        int a = 2, b = 4;

        swap(a, b);  // No actual swap in main due to pass-by-value
        System.out.println("After swap in main -> a = " + a + ", b = " + b);
    }
}
