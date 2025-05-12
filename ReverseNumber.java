import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int s) {
        int ans = 0;
        while(s != 0){
            int digit = s % 10;
            ans = ans * 10 + digit;
            s = s/10;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = reverseNumber(n);
        System.out.println((r));
        sc.close();
    }
}
