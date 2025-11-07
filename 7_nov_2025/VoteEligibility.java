
import java.util.*;  // Importing Scanner and Exception classes from util package
// Class that performs all vote eligibility operations
class VoteEligibilityChecker {  
    int age;  // Variable to store user's age
    // Constructor to take user input safely
    VoteEligibilityChecker() {
        Scanner sc = new Scanner(System.in);  // Scanner object for input
        try {
            // Asking user for their age
            System.out.print("Enter your age = ");
            age = sc.nextInt();  // Taking integer input from user

            // Checking if entered age is valid or not
            if (age <= 0) {
                // Negative or zero ages are invalid
                throw new IllegalArgumentException("Age must be a positive number.");
            }
        } catch (InputMismatchException e) {
            // If user enters a non-integer value (like text or symbol)
            System.out.println(" enter only numeric values for age.");
            System.exit(0);  // Terminate program 
        } catch (IllegalArgumentException e) {
            // If age entered is negative or zero
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }
    // Method to check vote eligibility
    void checkEligibility() {
        // Condition: 18 and above are eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote ");
        } else {
            System.out.println("You are not eligible to vote ");
        }
    }
}

// Main class to run the program
public class VoteEligibility {
    public static void main(String[] args) {
        try {
            // Creating object of VoteEligibilityChecker class
            VoteEligibilityChecker obj = new VoteEligibilityChecker();
            // Calling method to check and display eligibility
            obj.checkEligibility();
        } catch (Exception e) {
            // Catching any unexpected runtime errors
            System.out.println("Unexpected Error Occurred: " + e.getMessage());
        }
    }
}
