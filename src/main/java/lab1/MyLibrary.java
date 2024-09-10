package lab1;

public class MyLibrary {
    public static int power(int base, int exponent) {
        return exponent == 0 ? 1 : base * power(base, exponent - 1);
    }

    public static int factorial(int n) {
        return n < 2 ? 1 : n * factorial(n - 1);
    }
}
