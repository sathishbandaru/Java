import java.util.*;

class calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }

    public int sub(int a,int b)
    {
        return a-b;
    }
}

class AdvancedCalculator extends calculator
{
    public int mul(int a,int b)
    {
        return a*b;
    }

    public int div(int a,int b)
    {
        return a/b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        AdvancedCalculator c = new AdvancedCalculator();
        int r1 = c.mul(a,b);
        System.out.println(r1);

        sc.close();
    }
}
