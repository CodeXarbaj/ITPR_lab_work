import java.util.Scanner; // Import Scanner class for user input

class Triangle {

    public static void main(String[] args) {
        // Variables to store three angles of the triangle
        float angle1, angle2, angle3;

        // Create object of Scanner class to read input
        Scanner sc = new Scanner(System.in);

        // Take input of first angle from user
        System.out.print("Enter first angle: ");
        angle1 = sc.nextFloat(); // Store user input in angle1

        // Take input of second angle from user
        System.out.print("Enter second angle: ");
        angle2 = sc.nextFloat(); // Store user input in angle2

        // Take input of third angle from user
        System.out.print("Enter third angle: ");
        angle3 = sc.nextFloat(); // Store user input in angle3

        // Print a separator line for clarity
        System.out.println("-------------------------------------");

        // Displaying the entered angles
        System.out.println("First Angle : " + angle1);
        System.out.println("Second Angle : " + angle2);
        System.out.println("Third Angle : " + angle3);

        // Verify if angles are positive and sum up to 180 degrees (triangle condition)
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && Math.abs((angle1 + angle2 + angle3) - 180) < 0.001) {
            System.out.println("These angles form a triangle.");

            // Determine type of triangle based on angles
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("It is an Equilateral triangle.");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("It is an Isosceles triangle.");
            } else {
                System.out.println("It is a Scalene triangle.");
            }

        } else { 
            // If angles are invalid or do not sum to 180
            System.out.println("These angles do not form any triangle.");
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
