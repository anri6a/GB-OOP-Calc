package org.example.calc;

public class ComplexNumber implements Operation<ComplexNumber>{
    double realPart;
    double imaginaryPart;

//    public ComplexNumber() {
//    }

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
