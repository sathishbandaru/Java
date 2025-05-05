import java.util.*;

class Example{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Polymorphism {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.println("Enter 3 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Example obj = new Example(); No need to create an object as it is a static method
        
        int resultfortwo = Example.add(a,b);
        System.out.println("result for two : "+resultfortwo);
        int resultforthree = Example.add(a,b,c);
        System.out.println("result for three : "+resultforthree);
        sc.close();

    }
}
