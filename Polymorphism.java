class A{

    public void add(int x, int y){
        int sum = x + y;
        System.out.print("Sum is = " +sum);
    }
}

class B extends A{

    public void add(int x, int y, int z){
        int sum = x + y + z;
        System.out.print("Sum is = " +sum);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.add(5,5,5);       
    }
    
}
