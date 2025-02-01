package org.example;

public abstract class AbstractCalculatorIntegral {

    protected double a;
    protected double b;
    protected Function function;

    public AbstractCalculatorIntegral(double a, double b, Function function) {
        this.a = a;
        this.b = b;
        this.function = function;
    }

    public abstract double get();
}

