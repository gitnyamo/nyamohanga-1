public class Calculator {
    public int add(int a, int b) {
        return a + b;

    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by Zero");
        }
    }

    public double squareRoot(int a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            throw new IllegalArgumentException("Cannot calculate square of a negative number");
        }
    }

    public double square(int a){
        return a*a;
        }
}
