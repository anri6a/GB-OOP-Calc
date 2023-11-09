package org.example.calc;

public class Calculator {
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public static double div(double a, double b) {
//        return a / b;
//    }
//
//    public static double multiply(double a, double b) {
//        return a * b;
//    }

//    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
//        double realPart = a.getRealPart() + b.getRealPart();
//        double imaginaryPart = a.getImaginaryPart() + b.getImaginaryPart();
//        return new ComplexNumber(realPart, imaginaryPart);
//    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() - b.getRealPart();
        double imaginaryPart = a.getImaginaryPart() - b.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryPart = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double realPart = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) / denominator;
        double imaginaryPart = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

//    public static RationalNumber add(RationalNumber a, RationalNumber b) {
//        int numerator = a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator();
//        int denominator = a.getDenominator() * b.getDenominator();
//        return new RationalNumber(numerator, denominator);
//    }

    public static RationalNumber subtract(RationalNumber a, RationalNumber b) {
        int numerator = a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator();
        int denominator = a.getDenominator() * b.getDenominator();
        return new RationalNumber(numerator, denominator);
    }
    public static RationalNumber multiply(RationalNumber a, RationalNumber b) {
        int numerator = a.getNumerator() * b.getNumerator();
        int denominator = a.getDenominator() * b.getDenominator();
        return new RationalNumber(numerator, denominator);
    }
    public static RationalNumber div(RationalNumber a, RationalNumber b) {
        int numerator = a.getNumerator() * b.getDenominator();
        int denominator = a.getDenominator() * b.getNumerator();
        return new RationalNumber(numerator, denominator);
    }

}
