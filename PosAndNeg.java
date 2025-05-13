import java.util.*;

public class PosAndNeg {

    public static void seperate(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        seperate(arr);
        sc.close();
    }
}
