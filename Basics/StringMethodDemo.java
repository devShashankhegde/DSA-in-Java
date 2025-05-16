import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Original string with extra spaces
        String str = new String(" harra  dj k  s      ");

        // Print original string length
        System.out.println("Original Length: " + str.length());

        // Print original string
        System.out.println("Original String: \"" + str + "\"");

        // Replace all spaces with underscores
        str = str.replace(" ", "_");
        System.out.println("After replacing spaces with underscores: " + str);

        // Check if string starts with "_ha"
        System.out.println("Starts with \"_ha\": " + str.startsWith("_ha"));

        // Find index of 'r' after position 4
        System.out.println("Index of 'r' after index 4: " + str.indexOf('r', 4));

        sc.close(); // close the scanner
    }
}
