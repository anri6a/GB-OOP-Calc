package org.example.calc;

public class ComplexNumber implements Operation<ComplexNumber>{
    double realPart;
    double imaginaryPart;

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() + b.getRealPart();
        double imaginaryPart = a.getImaginaryPart() + b.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() - b.getRealPart();
        double imaginaryPart = a.getImaginaryPart() - b.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double realPart = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) / denominator;
        double imaginaryPart = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryPart = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
