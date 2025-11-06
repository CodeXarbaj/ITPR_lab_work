
import java.util.Scanner;

//Parent class
class BasicCalculator{
    double add(double a, double b){
        return a+b;
    }
    double sub(double a, double b){
        return a-b;
    }
}

//Child class using inheritance
class AdvancedCalculator extends BasicCalculator{
    double mult(double a, double b){
        return a*b;
    }
    double div(double a, double b){
        if (b==0) {
            System.out.println("Cannot divide by zero!");
        }
        return a/b;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Enter first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number : ");
        double num2 = sc.nextDouble();
        
         System.out.println("\nSelect Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result = switch(choice){
            case 1 -> calc.add(num1, num2);
            case 2 -> calc.sub(num1, num2);
            case 3 -> calc.mult(num1, num2);
            case 4 -> calc.div(num1, num2);
            default -> {
                System.out.println("Invalid choice!");
                yield 0;
            }
        };

        System.out.println("\nResult = " + result);
        sc.close();
    }
}
