import java.util.Scanner;  // Import Scanner class for taking input from the user

// Class Calculator to perform arithmetic operations
class Calculator {
    // Private member variables to store numbers and results
    private double num1;       // First number
    private double num2;       // Second number
    private double sum;        // Sum of num1 and num2
    private double difference; // Difference of num1 and num2
    private double product;    // Product of num1 and num2

    // Constructor to initialize all variables
    public Calculator() {
        num1 = 0;        // Initialize num1 to 0
        num2 = 0;        // Initialize num2 to 0
        sum = 0;         // Initialize sum to 0
        difference = 0;  // Initialize difference to 0
        product = 0;     // Initialize product to 0
    }

    // Method to take input from the user
    public void inputNumbers() {
        Scanner sc = new Scanner(System.in);       // Create Scanner object
        System.out.print("Enter first number: ");  // Prompt for first number
        num1 = sc.nextDouble();                    // Read first number
        System.out.print("Enter second number: "); // Prompt for second number
        num2 = sc.nextDouble();                    // Read second number
    }

    // Method to calculate the sum
    public void calculateSum() {
        sum = num1 + num2;  // Add num1 and num2 and store in sum
    }

    // Method to calculate the difference
    public void calculateDifference() {
        difference = num1 - num2;  // Subtract num2 from num1 and store in difference
    }

    // Method to calculate the product
    public void calculateProduct() {
        product = num1 * num2;  // Multiply num1 and num2 and store in product
    }

    // Method to display results
    public void displayResults() {
        System.out.println("Addition of numbers: " + sum);         // Print sum
        System.out.println("Difference of numbers: " + difference); // Print difference
        System.out.println("Product of numbers: " + product);      // Print product
    }
}

// Main class to run the program
public class ArithmeticOperations{
    public static void main(String[] args) {
        Calculator calc = new Calculator();  // Create object of Calculator class
        
        calc.inputNumbers();        // Call method to take input from user
        calc.calculateSum();        // Call method to calculate sum
        calc.calculateDifference(); // Call method to calculate difference
        calc.calculateProduct();    // Call method to calculate product
        calc.displayResults();      // Call method to display all results
    }
}
