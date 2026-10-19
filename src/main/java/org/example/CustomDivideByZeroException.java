package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends  Exception {
    private double a;
    private double b;

    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public CustomDivideByZeroException(double a, double b){
        super("Attempted to divide by zero.");
        this.a = a;
        this.b = b;
    }
}
