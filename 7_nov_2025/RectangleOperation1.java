
import java.util.*;  // Importing Scanner class from util package

// Class to perform all rectangle-related operations
class RectangleCalculator {  
    double width;   // Variable to store width of rectangle
    double height;  // Variable to store height of rectangle

    // Constructor to take user input safely using exception handling
    RectangleCalculator() {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input

        try {
            // Asking user for width input
            System.out.print("Give the width of rectangle = ");
            width = sc.nextDouble();  // Taking input from user

            // Asking user for height input
            System.out.print("Give the height of rectangle = ");
            height = sc.nextDouble();  // Taking input from user

            // Checking for negative or zero values
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Width and height must be positive numbers.");
            }

        } catch (InputMismatchException e) {
            // If user enters a non-numeric value
            System.out.println("Please enter only numeric values for width and height.");
            System.exit(0);  // Exit the program after showing message
        } catch (IllegalArgumentException e) {
            // If user enters negative or zero value
            System.out.println("Error: " + e.getMessage());
            System.exit(0);  // Exit the program after showing message
        }
    }


    // Method to calculate perimeter of rectangle
    double calculatePerimeter() {
        return 2 * (width + height);
    }



    // Method to calculate area of rectangle
    double calculateArea() {
        // Formula for area = width * height
        return width * height;
    }


    // Method to display the results
    void display() {
        // Printing the calculated area
        System.out.println("Area of Rectangle = " + calculateArea());
        // Printing the calculated perimeter
        System.out.println("Perimeter of Rectangle = " + calculatePerimeter());
    }
}

// Main class that runs the program
public class RectangleOperation1 {
    public static void main(String[] args) {
        try {
            // Creating object of RectangleCalculator class
            RectangleCalculator obj = new RectangleCalculator();
            // Calling display() method to show result
            obj.display();
        } catch (Exception e) {
            System.out.println("Unexpected Error Occurred: " + e.getMessage());
        }
    }
}
