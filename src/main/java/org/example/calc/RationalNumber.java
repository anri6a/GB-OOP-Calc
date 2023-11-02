package org.example.calc;

public class RationalNumber {
    private int numerator;
    private int denomerator;

    public RationalNumber(int numerator, int denominator) {
        this.denomerator = denominator;
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denomerator;

    }

    public void reduce() {
        int gcd = greatestCommonDivisor(numerator, denomerator);
        numerator /= gcd;
        denomerator /= gcd;
    }


    private int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
