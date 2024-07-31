package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Alice", 25);
            System.out.println("Person created: " + person.getName() + ", " + person.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Calculator calculator = new Calculator();
        try {
            int fact = calculator.factorial(5);
            System.out.println("Factorial of 5: " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int binCoeff = calculator.binomialCoefficient(5, 2);
            System.out.println("Binomial Coefficient of 5 choose 2: " + binCoeff);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

