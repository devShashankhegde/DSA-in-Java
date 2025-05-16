import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Display menu
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");

        int ch = s.nextInt();  // User choice

        switch (ch) {
            case 1: // Circle
                System.out.print("Enter radius: ");
                int radius = s.nextInt();
                float circleArea = 3.14f * radius * radius;
                System.out.println("Area of Circle: " + circleArea);
                break;

            case 2: // Triangle
                System.out.print("Enter base and height: ");
                int base = s.nextInt();
                int height = s.nextInt();
                float triangleArea = 0.5f * base * height;
                System.out.println("Area of Triangle: " + triangleArea);
                break;

            case 3: // Square
                System.out.print("Enter side: ");
                int side = s.nextInt();
                float squareArea = side * side;
                System.out.println("Area of Square: " + squareArea);
                break;

            case 4: // Rectangle
                System.out.print("Enter length and breadth: ");
                int length = s.nextInt();
                int breadth = s.nextInt();
                float rectangleArea = length * breadth;
                System.out.println("Area of Rectangle: " + rectangleArea);
                break;

            default:
                System.out.println("Invalid option. Please choose between 1 and 4.");
        }

        s.close(); // Close scanner
    }
}
