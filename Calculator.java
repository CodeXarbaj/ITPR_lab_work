/*Making a calculator using switch expression */

import java.util.Scanner;

class Calculator {          //class of calculator
    public static void main(String[] args) {        //main method
        Scanner sc = new Scanner(System.in); // creating sc object for input
        System.out.println("Which operation do you want to Perform?");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int input = sc.nextInt(); //Taking input to select from one of these
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();  //Taking input of number 1(in double)
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();  //Taking input of number 2(in double)
        String result = switch (input) {    //Switch Expression 
            case 1 -> "Result = " + (num1 + num2);  // case 1 for addition
            case 2 -> "Result = " + (num1 - num2);  //case 2 for substraction
            case 3 -> "Result = " + (num1 * num2); // cadse 3 for multiplication
            case 4 -> {                            //case 4 for division
                if (num2 != 0) { //checking condtion the 2nd number not be zero
                    yield "Result = " + (num1 / num2);
                } else {
                    yield "Error: Division by zero not allowed!";
                }
            }
            default -> "Invalid choice! Please select 1–4."; // if input will not math with case then it will be execute
        }; 
        System.out.println(result);
        sc.close();   //closing sc object to avoid resource leak
    }
}
