
import java.util.Scanner;
/*---Defining a class for Rectangle ----*/
public class RectangleOperations
{
	//member variable
	float length,breadth;
	//Constructor
	Rectangle()
	{
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//input of length
		System.out.print("Enter length of rectangle(in cm) : ");
		length = sc.nextFloat();
		//input of breadth
		System.out.print("Enter breadth of rectangle(in cm) : ");
		breadth = sc.nextFloat();
	}	
	//Displaying data
	public void displayData()
	{
		System.out.println("----------------------------------------------");
		System.out.println("-------- Rectangle -------");
		System.out.println("Length : "+length+" cm");
		System.out.println("Breadth : "+breadth+" cm");
	}
	
	//method for calculating area
	public void calculateArea()
	{
		float area = length * breadth;
		System.out.println("Area : "+area+" sq.cm");
	}
	
	//method for calculating perimeter
	public void calculatePerimeter()
	{
		float perimeter = 2 * (length + breadth);
		System.out.println("Perimeter : "+perimeter+" cm");		
	}
}
/*-------------------------------------------*/
public class RectangleOperations {
	public static void main(String[] args) {
		//Object of Rectangle class
		RectangleOperations rect = new RectangleOperations();
		//rect.inputData();
		rect.displayData();
		rect.calculatePerimeter();
		rect.calculateArea();
	}
}
