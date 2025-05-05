class Calculator {
    
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

public class OverloadingExample2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.multiply(2, 3);            
        int result2 = calc.multiply(2, 3, 4);       
        double result3 = calc.multiply(2.5, 3.0);     

        System.out.println("Multiply 2 and 3 = " + result1);
        System.out.println("Multiply 2, 3, and 4 = " + result2);
        System.out.println("Multiply 2.5 and 3.0 = " + result3);
    }
}
