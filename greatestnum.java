
import java.util.Scanner;

 class greatestnum {
    //method to calculate greatest number in two number
    public static void simpleinterestcalculator(int a, int b){
        if (a>b) { // cindition check
            System.out.println(" 1st value is greatest = "+a);
        }
        else if (b>a) { //condition check
            System.out.println("2nd value is greatest = "+b);   
        }
        else{
            System.out.println("Both are eqaul");
        }

    }
    public static void main(String[] args) {
        int a; //for storing 1st number
        int b; //for storing 2nd number
        Scanner sc = new Scanner(System.in);
        System.out.print("Give 1st number = " );
        a = sc.nextInt(); //Taking user input for 1st number
        System.out.print("Give 2nd number = " );        
        b = sc.nextInt(); //Taking user input for 2nd number

            //calling method
        simpleinterestcalculator( a, b);
               // Closing scanner
        sc.close();
    }
}
