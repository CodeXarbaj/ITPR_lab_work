import java.util.Scanner;

// Creating class for recursion
public class RecursiveFactorial {
    // Method to calculate factorial of any positive number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else if (n < 0) {
            System.out.println("Undefined for negative numbers");
            return -1; // Return error indicator
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner open
        System.out.print("Give the number to find factorial = ");
        int n = sc.nextInt();   //taking input from user 
        int result = factorial(n); //function calling with parameter pass
        if (result != -1) {   //contion check 
            System.out.println("Factorial of number " + n + " is " + result);
        }
        sc.close(); // Scanner closed at the end
    }
}
