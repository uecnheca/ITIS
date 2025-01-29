package org.example;

public abstract class CalculatorIntegral {
    /*

     */
    private double a;
    private double b;
    private Function function;

    public CalculatorIntegral(double a, double b, Function function) {
        this.a = a;
        this.b = b;
        this.function = function;
    }

    public abstract double get();
}

