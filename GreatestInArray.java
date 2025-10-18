// Program to input 15 numbers and find the greatest number among them
import java.util.Scanner;  // Import Scanner class for user input

//  Class that performs all operations
class NumberOperations {
    // Private member variable to store numbers
    private int[] numbers = new int[15];

    // Constructor takes input from user
    public NumberOperations() {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.println("Enter 15 numbers");
        for (int i = 0; i < numbers.length; i++) { // Loop for taking input
            System.out.print("Enter number " + (i + 1) + " =  ");
            numbers[i] = sc.nextInt();  // Store user input in array
        }
        sc.close(); // Close Scanner to avoid resource leak
    }
    // Method to find the greatest number
    public int findGreatestNumber() {
        int greatest = numbers[0]; // Assume first number is greatest
        for (int i = 1; i < numbers.length; i++) { // Loop through array
            if (numbers[i] > greatest) {  // Compare each element
                greatest = numbers[i];   // Update greatest if larger found
            }
        }
        return greatest; // Return greatest number to caller
    }
    // Method to display the result
    public void displayGreatestNumber() {
        int greatest = findGreatestNumber(); // Call find method
        System.out.println("\nThe greatest number is =  " + greatest);
    }
}

// Main class same name as file
public class GreatestInArray {
    // Main method 
    public static void main(String[] args) {
        // Create object of NumberOperations
        NumberOperations obj = new NumberOperations();

        // Calling method
        obj.displayGreatestNumber();
    }
}
