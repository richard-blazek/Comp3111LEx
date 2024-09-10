package lab1;

public class MyLibrary {
    private static int power(int base, int exponent, int acc) {
        if (exponent == 0) return acc;
        if (exponent % 2 == 0) return power(base * base, exponent / 2, acc);
        return power(base, exponent - 1, acc * base);
    }

    public static int power(int base, int exponent) {
        return power(base, exponent, 1);
    }

    public static int factorial(int n) {
        return n < 2 ? 1 : n * factorial(n - 1);
    }
}
