/*--- Program to check three angles form a triangle or not 
 * -----------------------------------------------------------------
 * -- If they form a triangle, determine the type of triangle being formed
 */

import java.util.Scanner; // Import Scanner class for user input

public class TriangleBasedOnAngles {

    public static void main(String[] args) {
        // Variables to store three angles
        float angle1, angle2, angle3;

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Take input of first angle
        System.out.print("Enter first angle : ");
        angle1 = sc.nextFloat(); // Store user input in angle1

        // Take input of second angle
        System.out.print("Enter second angle : ");
        angle2 = sc.nextFloat(); // Store user input in angle2

        // Take input of third angle
        System.out.print("Enter third angle : ");
        angle3 = sc.nextFloat(); // Store user input in angle3

        // Print separator line
        System.out.println("-------------------------------------");

        // Display the entered angles
        System.out.println("First Angle : " + angle1);
        System.out.println("Second Angle : " + angle2);
        System.out.println("Third Angle : " + angle3);

        /*--- Verify if the angles can form a triangle ---*/
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180) {
            // Angles form a triangle

            if (angle1 < 90 && angle2 < 90 && angle3 < 90) { 
                // All angles less than 90 → acute-angled triangle
                System.out.println("Above angles form acute angled triangle");
            } else {
                if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    // Any angle equal to 90 → right-angled triangle
                    System.out.println("Above angles form right angled triangle");
                } else {
                    // Remaining case → obtuse-angled triangle
                    System.out.println("Above angles form Obtuse angled triangle");
                }
            }

        } else { 
            // Angles are invalid or do not sum to 180 → cannot form triangle
            System.out.println("These angles do not form any triangle");
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}
