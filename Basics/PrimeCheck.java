// Program to print all prime numbers up to a given number using functions

import java.util.Scanner;

public class PrimeCheck {

    // Checks whether a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Prints all primes from 2 to n
    public static void range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        range(n);
    }
}
