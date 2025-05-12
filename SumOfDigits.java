import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(String s){
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i))) {
                ans += Character.getNumericValue(s.charAt(i));
            }
        }
        return ans;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = sumOfDigits(s);
        System.out.println("Sum of digits in the entered string is: " + result);
        sc.close();
    }
}
