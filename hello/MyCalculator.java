package hello;

public class MyCalculator {
    
    @FunctionalInterface interface Calc {
        int execute(int num1, int num2);
    }

    public int operate(int a, int b, Calc calc) {
        return calc.execute(a, b);
    }

    public int add() {
        return operate(1, 2, (num1, num2) -> num1 + num2);
    }

    public int plus(int a, int b){
        return a + b ;
    }

    public int minus(int a, int b){
        return a - b ;
    }
    public int multi(int a, int b){
        return a * b ;
    }
    public int divide(int a, int b){
        return a / b ;
    }
}
