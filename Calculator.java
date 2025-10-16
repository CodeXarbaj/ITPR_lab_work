import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation do you want to Perform?");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int input = sc.nextInt(); 
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        String result = switch (input) {
            case 1 -> "Result = " + (num1 + num2);
            case 2 -> "Result = " + (num1 - num2);
            case 3 -> "Result = " + (num1 * num2);
            case 4 -> {
                if (num2 != 0) {
                    yield "Result = " + (num1 / num2);
                } else {
                    yield "Error: Division by zero not allowed!";
                }
            }
            default -> "Invalid choice! Please select 1–4.";
        }; 
        System.out.println(result);
        sc.close();
    }
}
