import java.util.Scanner;

public class Primes {
    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int num = 2;
            int c = 1;
            while(c <= n){
                if(isPrime(num)){
                    System.out.print(num+" ");
                    // num += 1;
                    c += 1;
                }
                num += 1;
            }
        }
    }
}
