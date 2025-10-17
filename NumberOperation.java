
/*---- Defining Number class ----*/
class Number
{
	int num1 = 20;//instance variable
	public static int num2 = 10;// class variable or static variable
	
	/*--- Method to Increament the values of both ----*/
	public void increment() // instance method
	{
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
		num1 = num1 + 20;
		num2 = num2 + 10;		
	}
	
	//method to decrement the values
	public static void decrement() // static method
	{
		num2 = num2 - 40;
		System.out.println("Second No. : "+num2);
	}
}
public class NumberOperation {

	public static void main(String[] args) {
		//first object
		System.out.println("----- Object 1 ------");
		Number obj1 = new Number();
		obj1.increment();
		obj1.increment();
		
		//second object
		System.out.println("----- Object 2 ------");
		Number obj2 = new Number();
		obj2.increment();
		obj2.increment();
		
		obj1.decrement();
		obj2.decrement();
		Number.decrement();

	}

}

