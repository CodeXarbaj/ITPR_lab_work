import java.util.Scanner;

class SimpleInterest {
    // Method to calculate and display simple interest
    public static void calculateSimpleInterest(float p, int t, float r) {
        // calculating simple interest
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest: Rs " + si);
    }

    public static void main(String[] args) {
        float principal; // to store principal
        float rate;      // to store rate
        int time;        // to store time

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount (in Rs): ");
        principal = sc.nextFloat(); //reading user input

        System.out.println("Enter rate of interest (in %): ");
        rate = sc.nextFloat(); // reading user input

        System.out.println("Enter time (in years): ");
        time = sc.nextInt(); // reading user input

        System.out.println("----------------------------------------------------------");
        System.out.println("Principal (Rs): " + principal);
        System.out.println("Rate (%): " + rate);
        System.out.println("Time (years): " + time);

        // Calling method
        calculateSimpleInterest(principal, time, rate);

        // Closing scanner
        sc.close();
    }
}
