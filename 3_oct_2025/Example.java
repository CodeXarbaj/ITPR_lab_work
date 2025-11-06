import java.util.Scanner;

class Example {     //Creating class of example 
    public static void main(String[] args) {    //main method
        Scanner sc = new Scanner(System.in);    //creating object sc

        System.out.println("Enter your age (in year): ");
        int age = sc.nextInt(); // Taking input in age variable

        System.out.println("----------------------------------");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();  //Taking input in name variable

        System.out.println("----------------------------------");
        System.out.println("Your Age: " + age);
        System.out.println("Your Name: " + name);

        sc.close(); //closed sc object to avoid resource leak
    }
}
