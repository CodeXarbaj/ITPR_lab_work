/*-- Program to find out Addition of two numbers when first number is less than second number --*/

import java.util.Scanner;
class AdditionExample {    			//class of addition example

	public static void main(String[] args) 		//main function
	{
		int num1,num2;   //Intialization of variable
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);  // Create sc for taking input
		//Input of Numbers
		System.out.println("Enter any two number : ");
		num1 = sc.nextInt(); // Taking input
		num2 = sc.nextInt(); // Taking input
		System.out.println("-----------------------------------------------");
		//Displaying number to the user
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
		/*---- finding Addition if num1 is less than num2 ----*/
		if(num1 < num2)  //Checking condition if number 1 is less than number 2
		{
			System.out.println("Addition : "+(num1+num2));
		}
		System.out.println("--------------------------------------");
	}
}

