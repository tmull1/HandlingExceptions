package org.example;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Parameters must be non-negative.");
        }
        if (k > n) {
            throw new IllegalArgumentException("Subset size cannot exceed set size.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}

