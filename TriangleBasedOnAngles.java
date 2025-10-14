/*--- Program to check three angles form a triangle or not 
 * -----------------------------------------------------------------
 * -- if they form a triangle then determine the type of triangle being formed------*/

import java.util.Scanner;
public class TriangleBasedOnAngles {

	public static void main(String[] args) {
		float angle1,angle2,angle3;
		//create object of scanner class
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first angle : ");
		angle1= sc.nextFloat();
		System.out.print("Enter second angle : ");
		angle2= sc.nextFloat();
		System.out.print("Enter third angle : ");
		angle3= sc.nextFloat();
		System.out.println("-------------------------------------");
		//Displaying angle
		System.out.println("First Angle : "+angle1);
		System.out.println("Second Angle : "+angle2);
		System.out.println("Third Angle : "+angle3);
		/*--- Verify Triangle formation */
		if(angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180)
		{
			//triangle formed
			if(angle1<90 && angle2<90 && angle3<90) //Acute angled triangle
			{
				System.out.println("Above angles form acute angled triangle");
			}
			else
			{
				if(angle1==90 || angle2==90 || angle3==90)//right angled triangle
				{
					System.out.println("Above angles form right angled triangle");
				}
				else
				{
					System.out.println("Above angles form Obtuse angled triangle");
				}
			}
		}
		else
		{
			System.out.println("These angles do not form any triangle");
		}
	}
}

