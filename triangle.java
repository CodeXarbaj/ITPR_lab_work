import java.util.Scanner;

class Triangle{

    public static void main(String[] args) {
        float angle1, angle2, angle3;

        // Create object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first angle: ");
        angle1 = sc.nextFloat();
        System.out.print("Enter second angle: ");
        angle2 = sc.nextFloat();
        System.out.print("Enter third angle: ");
        angle3 = sc.nextFloat();
        System.out.println("-------------------------------------");

        // Displaying the entered angles
        System.out.println("First Angle : " + angle1);
        System.out.println("Second Angle : " + angle2);
        System.out.println("Third Angle : " + angle3);

        // Verify if angles can form a triangle
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && Math.abs((angle1 + angle2 + angle3) - 180) < 0.001) {
            System.out.println("These angles form a triangle.");

            // Determine type of triangle
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("It is an Equilateral triangle.");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("It is an Isosceles triangle.");
            } else {
                System.out.println("It is a Scalene triangle.");
            }

        } else {
            System.out.println("These angles do not form any triangle.");
        }

        sc.close(); // Close the scanner
    }
}
