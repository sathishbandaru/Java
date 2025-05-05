import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isarmstrongNumber(int n){
        double sum = 0;
        int temp = n;
        while(n != 0){
            double digit = n%10;
            sum += Math.pow(digit,3);
            n = n/10;
        }
        if ((int)sum == temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        if(isarmstrongNumber(n))
            System.out.println("The number is armstrong");
        else
        System.out.println("The number is not an armstrong");
        sc.close();
    }
}
