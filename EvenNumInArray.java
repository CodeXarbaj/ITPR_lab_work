// Program to input 20 numbers and display even numbers among them using constructor and methods

import java.util.Scanner;  // Import Scanner class for input

// ===== Class for all operations =====
class NumberOperation {
    // Private member variable to store numbers
    private int []numbers;
  
    // Constructor → takes input from user
    public NumberOperation() {
        numbers = new int[20]; // Initialize array for 20 numbers
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < numbers.length; i++) { // Loop for taking input
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt(); // Take input from user
        }
        sc.close(); // Close Scanner to prevent resource leak
    }

    // Method to display even numbers
    public void display() {
        System.out.println("\nEven numbers are:");
        for (int i = 0; i < numbers.length; i++) { // Loop to check each number
            if (numbers[i] % 2 == 0) { // Checking condition for even number
                System.out.print(numbers[i] + " "); // Display even number
            }
        }
    }
}

// ===== Main class (entry point of program) =====
public class EvenNumInArray {
    public static void main(String[] args) {
        // Create object of NumberOperation → automatically takes input
        NumberOperation obj = new NumberOperation();

        // Call method to display even numbers
        obj.display();
    }
}
