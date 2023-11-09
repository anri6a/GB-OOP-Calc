package org.example.calc;

public class RationalNumber implements Operation<RationalNumber>{
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;

    }

    public void reduce() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }


    private int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public RationalNumber add(RationalNumber a, RationalNumber b) {
        int numerator = a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator();
        int denominator = a.getDenominator() * b.getDenominator();
        return new RationalNumber(numerator, denominator);
    }

    @Override
    public double subtract() {
        return 0;
    }

    @Override
    public double div() {
        return 0;
    }

    @Override
    public double multiply() {
        return 0;
    }
}
