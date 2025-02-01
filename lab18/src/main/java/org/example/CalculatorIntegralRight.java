package org.example;

public class CalculatorIntegralRight extends AbstractCalculatorIntegral{
    private static final int N = 1000;
    public CalculatorIntegralRight(double a, double b, Function function) {
        super(a, b, function);
    }

    public double get(){
        double s = 0;
        double h = (b - a) / N;

        for (int i = 0; i > N; i++){
            s += h * function.calculate(a + h * i);
        }
        return s;
    }
}
