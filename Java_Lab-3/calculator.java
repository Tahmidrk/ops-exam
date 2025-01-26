class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a,double b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }
    public double mul(double a,double b){
        return a*b;
    }

    public int divid(int a,int b){
        if (b==0){
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a/b;
    }
    public double divide(double a,double b){
        if (b==0.0){
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a/b;
    }
}
public class Main {
    public static void main(String[] args) {
    Calculator calc=new Calculator();
        System.out.println("Addition of integers: " + calc.add(10, 20));
        System.out.println("Addition of doubles: " + calc.add(5.5, 2.3));

        System.out.println("Subtraction of integers: " + calc.sub(20, 10));
        System.out.println("Subtraction of doubles: " + calc.sub(7.8, 3.4));

        System.out.println("Multiplication of integers: " + calc.mul(4, 5));
        System.out.println("Multiplication of doubles: " + calc.mul(3.3, 2.2));

        System.out.println("Division of integers: " + calc.divide(20, 4));
        System.out.println("Division of doubles: " + calc.divide(10.0, 2.5));


    }
}
