import java.util.Scanner;
class InterestCalculator {   
    private float principal, rate, result;
    private int time;
    // Constructor to take input
    public InterestCalculator() {
        // creating object for taking input from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal = ");
        principal = sc.nextFloat(); // taking input of principal
        System.out.print("Enter Rate = ");
        rate = sc.nextFloat(); // taking input of rate
        System.out.print("Enter Time (in years) = ");
        time = sc.nextInt(); // taking input of time
    }
    // Method to calculate simple interest
    public void calculateInterest() {
        result = (principal * rate * time) / 100;
    }
    // Method to display all details
    public void displayData() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Simple Interest = " + result);
    }
}
// Main class
public class SimpleInterest0 {
    public static void main(String[] args) {
        // Create object of InterestCalculator
        InterestCalculator si = new InterestCalculator();
        // Call methods
        si.calculateInterest();
        si.displayData();
    }
}
