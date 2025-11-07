

import java.util.*; // Importing utility package for Scanner class

// Class to perform all rectangle-related operations
class RectangleCalculator {  
    double width;   // Variable to store width of rectangle
    double height;  // Variable to store height of rectangle
    // Constructor to take user input
    RectangleCalculator() {
        Scanner sc = new Scanner(System.in);  // Scanner object for taking input from user
        // Asking user for width input
        System.out.print("Give the width of rectangle = ");
        width = sc.nextDouble();  // Storing width value entered by user
        System.out.print("Give the height of rectangle = ");
        height = sc.nextDouble();  // Storing height value entered by user
    }
    // Method to calculate perimeter of rectangle
    double calculatePerimeter() {
        // Formula for perimeter = 2 * (width + height)
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
        // Creating object of RectangleCalculator class
        RectangleCalculator obj = new RectangleCalculator();
        // Calling display() method to show results
        obj.display();
        // Program ends here
    }
}
