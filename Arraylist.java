import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();
            int a = sc.nextInt();
            list.add(a);
            list.add(5);
            list.add(6);
            System.out.println(list);           
            System.out.println(list.get(1));    
        }
    }
}
