package ua.kpi.tef;

import static java.lang.Math.pow;

public class TaylorSeries {

    public static double sinTaylor(double x, int iterationAmount) {

        if (iterationAmount <= 0) {
            throw new IllegalArgumentException("Iteration amount must be more than 0");
        }

        double sum = 0;
        for (int i = 0; i < iterationAmount; i++) {
            sum += pow(-1, i) * pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }

        return sum;
    }

    private static int factorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Factorial can't be taken from negative number");
        }
        if (a == 0 || a == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
