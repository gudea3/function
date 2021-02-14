package ro.sci.functions;

import ro.sci.functions.math.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("salutare");

        Calculator calculator = new Calculator();
        System.out.println("suma: " + calculator.aduna(2,3));
        System.out.println("fibonacci: " + calculator.fibonacci(10));
        System.out.println("scaderea: " +calculator.substract(4, 6));
        System.out.println("multiplicare: " +calculator.multiply(3, 6));
//        System.out.println("impartirea: " + calculator.divide(2, 0));
        calculator.divide(2,0);
    }
}
