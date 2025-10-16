import java.util.Scanner; // Import Scanner class for input

/*--- Defining a class for Rectangle ---*/
class CalculateRectangle
{
    // Member variables for length and breadth
    float length, breadth;

    // Constructor to take input from user
    CalculateRectangle()
    {
        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Input of length
        System.out.print("Enter length of rectangle(in cm) : ");
        length = sc.nextFloat();

        // Input of breadth
        System.out.print("Enter breadth of rectangle(in cm) : ");
        breadth = sc.nextFloat();

        // Close scanner to prevent resource leak
        sc.close();
    }    

    // Method to display rectangle details
    public void displayData()
    {
        System.out.println("----------------------------------------------");
        System.out.println("-------- Rectangle -------");
        System.out.println("Length : "+length+" cm");
        System.out.println("Breadth : "+breadth+" cm");
    }

    // Method to calculate and display area
    public void calculateArea()
    {
        float area = length * breadth; // Calculation of area
        System.out.println("Area : "+area+" sq.cm");
    }

    // Method to calculate and display perimeter
    public void calculatePerimeter()
    {
        float perimeter = 2 * (length + breadth); // Calculation of perimeter
        System.out.println("Perimeter : "+perimeter+" cm");        
    }
}

/*--- Main class to execute program ---*/
public class RectangleOperations
{
    public static void main(String[] args) {
        // Create object of RectangleOperations class
      CalculateRectangle rect = new CalculateRectangle();

        // Display rectangle details
        rect.displayData();

        // Calculate and display perimeter
        rect.calculatePerimeter();

        // Calculate and display area
        rect.calculateArea();
    }
}
