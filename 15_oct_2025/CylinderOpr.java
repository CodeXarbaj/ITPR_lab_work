import java.util.Scanner; // Import Scanner class to take input from user

// Class Cylinderoperation to perform all calculations
class Cylinderoperation {
    // Private member variables for radius, height, and results
    private double r;          // Radius of the cylinder
    private double h;          // Height of the cylinder
    private double curveSarea; // Curved Surface Area
    private double totalSarea; // Total Surface Area
    private double vol;        // Volume of the cylinder

    // Constructor to initialize radius and height using user input
    public Cylinderoperation() {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter radius of the cylinder: ");
        r = sc.nextDouble(); // Take radius input
        System.out.print("Enter height of the cylinder: ");
        h = sc.nextDouble(); // Take height input
        sc.close(); // Close Scanner to prevent memory leak
    }

    // Method to calculate Curved Surface Area (2 * π * r * h)
    public void calculateCurveSarea() {
        curveSarea = 2 * Math.PI * r * h;
    }

    // Method to calculate Total Surface Area (2 * π * r * (r + h))
    public void calculateTotalSarea() {
        totalSarea = 2 * Math.PI * r * (r + h);
    }

    // Method to calculate Volume (π * r² * h)
    public void calculateVol() {
        vol = Math.PI * r * r * h;
    }

    // Method to display all calculated results
    public void displayResults() {
        System.out.println("\n----- CYLINDER RESULTS -----");
        System.out.println("Curved Surface Area (CSA): " + curveSarea);
        System.out.println("Total Surface Area (TSA): " + totalSarea);
        System.out.println("Volume of Cylinder: " + vol);
    }
}

// Main class to execute the program
public class CylinderOpr {
    public static void main(String[] args) {
        Cylinderoperation cyl = new Cylinderoperation(); // Create object and take input through constructor

        cyl.calculateCurveSarea(); // Calculate Curved Surface Area
        cyl.calculateTotalSarea(); // Calculate Total Surface Area
        cyl.calculateVol();        // Calculate Volume
        cyl.displayResults();      // Display all results
    }
}
