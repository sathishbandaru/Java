class A{
    public void show(){
        System.out.println("now in A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("now in B");
    }
}

public class Overriding {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }    
}
