import java.util.Scanner; // Import Scanner class for taking user input
public class TrianglePerArea {
    // Private member variables to store sides, perimeter, and area
    private double side1, side2, side3;
    private double perimeter, area;
    // Constructor for taking input from the user
    public TrianglePerArea() {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Enter first side of triangle: ");
        side1 = sc.nextDouble(); // Input first side
        System.out.print("Enter second side of triangle: ");
        side2 = sc.nextDouble(); // Input second side
        System.out.print("Enter third side of triangle: ");
        side3 = sc.nextDouble(); // Input third side
    }
    // Method to perform calculations for perimeter and area
    public void calculate() {
        perimeter = side1 + side2 + side3; // Calculate perimeter by adding all sides
        double s = perimeter / 2; // Calculate semi-perimeter for Heron's formula
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Calculate area using Heron's formula
    }
    // Method to display results
    public void display() {
        System.out.println("\n--- Triangle Details ---");
        System.out.println("Side 1 = " + side1);
        System.out.println("Side 2 = " + side2);
        System.out.println("Side 3 = " + side3);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
    // Main method — program execution starts from here
    public static void main(String[] args) {
        TrianglePerArea triangle = new TrianglePerArea(); // Create object (constructor called for input)
        triangle.calculate(); // Call calculate method to find perimeter and area
        triangle.display();   // Call display method to show output
    }
}
