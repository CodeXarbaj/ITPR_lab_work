import java.util.Scanner;//Scanner class for creating object for input

public class factorial {
  //  method for calculating factorial of a number with taking parameter and return type 
    public static int fact_calculate(int n) {  
        int factorial = 1;  // start with 1    
        while (n > 0) { // loop will be run until i is not < 0.
            factorial = factorial * n; // multiply and store in fact
            n--;//Decrement the number for multiplication
        }
        return factorial; // return the result
    }

    public static void main(String[] args) { //main function, the code will start execute form here
        Scanner sc = new Scanner(System.in);//Create sc object for input
        System.out.print("Give the number to find factorial: ");
        int n = sc.nextInt(); // here input is taken by user
         sc.close(); // close the sc object to avoid resource leak
        if (n<0) {
            System.out.println("Factorial for negative number is not possible");
        }
            else
             if(n==0){
            System.out.println("Factorial = 1");
            }
        else{
             long result = fact_calculate(n); //function calling with passing the number 
             System.out.println("Factorial = " + result);//result printing
        }
       
       

    }
}
