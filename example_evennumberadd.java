import java.util.Scanner;
class EvenNumberAdd
{
public static int evenNatural(int n)
{
    if(n==0)
        return 0;
    else if(n%2!=0){
        System.out.println("It is not even natural number");

    }
    else if(n==2)
        {
        return 2;
        }
    return evenNatural(n-1);
}
public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int sum=evenNatural(n);
    System.out.println("The number is: "+n);
    System.out.println("The sum is: "+sum);
    sc.close();
}
}