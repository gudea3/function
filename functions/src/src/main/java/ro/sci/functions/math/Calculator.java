package ro.sci.functions.math;

/**
 * Calculator utility.
 */
public class Calculator {

    /**
     * Function that calculates the sum of two integer numbers
     *
     * @param x
     * @param y
     * @return the sum
     */
    public int aduna(int x, int y) {
        return x + y;
    }

    /**
     * Function that calculates fibonacci sum
     *
     * @param n - the number to calculate fibonacci for
     * @return fibonacci sum
     */
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int substract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public void divide(double x, double y) {

        if (y == 0) {
            System.out.println("nu se poate imparti cu 0");
        } else {
            System.out.println("impartirea: " + (x / y));
        }
    }
}
