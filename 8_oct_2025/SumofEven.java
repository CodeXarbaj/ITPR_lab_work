
import java.util.Scanner;
//Class for sum of even numbers
public class SumofEven {
    // Recursive method to find sum of even numbers up to n
    public static int Even_Number_sum(int n) {
        if (n <= 0) {
            return 0; // Base case
        }
        if (n % 2 == 0) {
            return n + Even_Number_sum(n - 2); // Add even number
        } else {
            return Even_Number_sum(n - 1); // Skip odd numbers
        }
    }

    public static void main(String[] args) {
        int n; // You can take input using Scanner also
        Scanner sc = new Scanner(System.in); //creating scanner object for reading input by user
        System.out.println("Give the number = ");
        n = sc.nextInt();  // taking input by user
        sc.close(); // Closing the sc for avoid resource leak
        int result = Even_Number_sum(n); //Function callling and passing the value
        System.out.println("Sum of even numbers up to " + n + " is " + result);
    }
}
