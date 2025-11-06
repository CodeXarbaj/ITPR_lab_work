import java.util.Scanner; // Import the Scanner class for user input

class EvenNumberAdd
{
    // Method to calculate sum of even natural numbers up to n
    public static int evenNatural(int n)
    {
        if(n == 0) // Base case: if n is 0, return 0
            return 0;
        else if(n % 2 != 0){ // Check if the number is not even
            System.out.println("It is not even natural number"); // Print statement skipped for commenting
        }
        else if(n == 2) // If n is 2, return 2
        {
            return 2;
        }
        return evenNatural(n - 1); // Recursive call for n-1
    }

    public static void main(String[] args){
        int n; // Declare variable n
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        n = sc.nextInt(); // Read integer input from user
        int sum = evenNatural(n); // Call method to get sum
        System.out.println("The number is: "+n); // Print statement skipped for commenting
        System.out.println("The sum is: "+sum); // Print statement skipped for commenting
        sc.close(); // Close the scanner to prevent resource leak
    }
}
