package org.example;

public class CalculatorIntegralTrapezia extends AbstractCalculatorIntegral {
    public final int N = 1000;
    public CalculatorIntegralTrapezia(double a, double b, Function function) {
        super(a, b, function);
    }

    public double get() {
        double sum = 0;
        double h = (b - a) / N;
        for (int i = 0; i < N; i++) {
            sum += h * (function.calculate(a + h * i) + function.calculate((a + h * (i + 1)))) / 2;
        }
        return sum;
    }
}
