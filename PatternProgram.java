import java.util.Scanner;

public class PatternProgram {

    public static void pattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public static void invertedPattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 10 ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            pattern(n);
            invertedPattern(n);
            sc.close();

        }
    }
}
