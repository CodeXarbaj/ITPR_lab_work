/*-- Program to find out Addition of two numbers when first number is less than second number --*/

import java.util.Scanner;
class AdditionExample {

	public static void main(String[] args) 
	{
		int num1,num2;
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//Input of Numbers
		System.out.println("Enter any two number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("-----------------------------------------------");
		//Displaying number to the user
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
		/*---- finding Addition if num1 is less than num2 ----*/
		if(num1 < num2)
		{
			System.out.println("Addition : "+(num1+num2));
		}
		System.out.println("--------------------------------------");
	}
}

