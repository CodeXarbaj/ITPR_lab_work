
import java.util.Scanner;
public class RectangleOperation {

	public static void main(String[] args) {
		//variable to store length and breadth
		float length,breadth;
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//input of length
		System.out.print("Enter length of rectangle(in cm) : ");
		length = sc.nextFloat();
		//validating length
		if(length<0)
		{
			System.err.println("Length cannot be negative");
		}
		else
		{
			//input of breadth
			System.out.print("Enter breadth of rectangle(in cm) : ");
			breadth = sc.nextFloat();
			//validating breadth
			if(breadth<0)
			{
				System.err.println("Breadth cannot be negative");				
			}
			else
			{
				float area = length * breadth;
				float perimeter = 2 * (length + breadth);
				System.out.println("----------------------------------------------");
				System.out.println("-------- Rectangle -------");
				System.out.println("Length : "+length+" cm");
				System.out.println("Breadth : "+breadth+" cm");
				System.out.println("Perimeter : "+perimeter+" cm");
				System.out.println("Area : "+area+" sq.cm");
			}
		}
  sc.close();
	}

}

