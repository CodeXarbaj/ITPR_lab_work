import java.util.Scanner; // Import Scanner class to take input from user

// Class CylinderOpr to perform all calculations
class CylinderOpr {
    // Private member variables to store radius, height and results
    private double r;          // Radius of the cylinder
    private double h;          // Height of the cylinder
    private double curveSarea; // Curved Surface Area (CSA)
    private double totalSarea; // Total Surface Area (TSA)
    private double vol;        // Volume of the cylinder

    // Constructor to initialize all values to zero
    public CylinderOpr() {
        r = 0;           // Initialize radius to 0
        h = 0;           // Initialize height to 0
        curveSarea = 0;  // Initialize Curved Surface Area to 0
        totalSarea = 0;  // Initialize Total Surface Area to 0
        vol = 0;         // Initialize Volume to 0
    }

    // Method to take input from user
    public void inputDimensions() {
        Scanner sc = new Scanner(System.in);           // Create Scanner object
        System.out.print("Enter radius of cylinder: "); // Ask for radius
        r = sc.nextDouble();                            // Store radius
        System.out.print("Enter height of cylinder: "); // Ask for height
        h = sc.nextDouble();                            // Store height
       }

    // Method to calculate Curved Surface Area (CSA = 2 * π * r * h)
    public void calculateCurveSarea() {
        curveSarea = 2 * Math.PI * r * h; // Formula for Curved Surface Area
    }

    // Method to calculate Total Surface Area (TSA = 2 * π * r * (r + h))
    public void calculateTotalSarea() {
        totalSarea = 2 * Math.PI * r * (r + h); // Formula for Total Surface Area
    }

    // Method to calculate Volume (V = π * r² * h)
    public void calculateVol() {
        vol = Math.PI * r * r * h; // Formula for Volume
    }

    // Method to display all calculated results
    public void displayResults() {
        System.out.println("\n----- CYLINDER RESULTS -----"); // Title line
        System.out.println("Curved Surface Area (CSA): " + curveSarea);
        System.out.println("Total Surface Area (TSA): " + totalSarea);
        System.out.println("Volume of Cylinder: " + vol);
    }

    // Main method — program execution starts here
    public static void main(String[] args) {
        CylinderOpr cyl = new CylinderOpr();      // Create object of CylinderOpr class

        cyl.inputDimensions();                    // Take input for radius & height
        cyl.calculateCurveSarea();                // Calculate Curved Surface Area
        cyl.calculateTotalSarea();                // Calculate Total Surface Area
        cyl.calculateVol();                       // Calculate Volume
        cyl.displayResults();                     // Display all results
    }
}
