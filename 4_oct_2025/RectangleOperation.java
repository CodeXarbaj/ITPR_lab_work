import java.util.Scanner; // Import Scanner class for user input

public class RectangleOperation {

    public static void main(String[] args) {
        // Variable to store length and breadth of rectangle
        float length, breadth;

        // Creating Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Input of length
        System.out.print("Enter length of rectangle(in cm) : ");
        length = sc.nextFloat(); // Read float value for length

        // Validating length to ensure it's non-negative
        if(length < 0)
        {
            System.err.println("Length cannot be negative"); // Print error if length is negative
        }
        else
        {
            // Input of breadth
            System.out.print("Enter breadth of rectangle(in cm) : ");
            breadth = sc.nextFloat(); // Read float value for breadth

            // Validating breadth to ensure it's non-negative
            if(breadth < 0)
            {
                System.err.println("Breadth cannot be negative"); // Print error if breadth is negative
            }
            else
            {
                // Calculating area
                float area = length * breadth;

                // Calculating perimeter
                float perimeter = 2 * (length + breadth);

                // Displaying rectangle details
                System.out.println("----------------------------------------------");
                System.out.println("-------- Rectangle -------");
                System.out.println("Length : "+length+" cm");
                System.out.println("Breadth : "+breadth+" cm");
                System.out.println("Perimeter : "+perimeter+" cm");
                System.out.println("Area : "+area+" sq.cm");
            }
        }

        sc.close(); // Close Scanner object to prevent resource leak
    }

}
