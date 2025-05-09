class A{
    public A() {
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in int A");
    }
}

class B extends A{
    public B() {
        //this(5);
        // super(5);
        
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in int B");
    }

}


public class Constructors {
    public static void main(String[] args) {
        B obj = new B(6);
        
    }
}
