class A{
    public void show(){
        System.out.println("now in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("now in A");
    }
}

public class Overriding {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }    
}
