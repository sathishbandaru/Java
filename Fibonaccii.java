import java.util.*;

public class Fibonaccii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 1;
        
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            System.out.print(a+" ");
            int temp = a+b;
            a = b;
            b = temp;
            
        }
        
        sc.close();
    }
}
