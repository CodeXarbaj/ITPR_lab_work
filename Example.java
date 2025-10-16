import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age (in year): ");
        int age = sc.nextInt();
        sc.nextLine();  

        System.out.println("----------------------------------");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Your Age: " + age);
        System.out.println("Your Name: " + name);

        sc.close(); 
    }
}
