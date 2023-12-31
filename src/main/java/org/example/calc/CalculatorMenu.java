package org.example.calc;


import org.apache.logging.log4j.*;

import java.util.Scanner;


public class CalculatorMenu {

    private static final Logger logger = LogManager.getLogger(CalculatorMenu.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    performRationalCalculation(scanner);
                    break;
                case 2:
                    performComplexCalculation(scanner);
                    break;
                case 3:
                    logger.info("exit from calculator");
                    break;
                default:
                    logger.error("wrong choice");
                    break;
            }
        }
    }

    private static void performComplexCalculation(Scanner scanner) {
        System.out.println("for complex numbers - ");
        System.out.print("enter real part 1 number");
        double realPart1 = scanner.nextDouble();
        System.out.print("enter imaginary part 1 number");
        double imaginaryPart1 = scanner.nextDouble();
        ComplexNumber complex1 = new ComplexNumber(realPart1, imaginaryPart1);
        System.out.print("enter real part 2 number");
        double realPart2 = scanner.nextDouble();
        System.out.print("enter imaginary part 2 number");
        double imaginaryPart2 = scanner.nextDouble();
        ComplexNumber complex2 = new ComplexNumber(realPart2, imaginaryPart2);

        System.out.println("enter operation");
        System.out.println("1. Sum");
        System.out.println("2. subtract");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.print("your choice: ");
        int operation = scanner.nextInt();

//        ComplexNumber result = null;
        ComplexNumber result = new ComplexNumber();
        switch (operation) {
            case 1:
                logger.info("sum was successfully done");
                result =result.add (complex1, complex2);
                break;
            case 2:
                logger.info("subtract was successfully done");
                result = result.subtract(complex1, complex2);
                break;
            case 3:
                logger.info("multiply was successfully done");
                result = result.multiply(complex1, complex2);
                break;
            case 4:
                logger.info("div was successfully done");
                result = result.div(complex1, complex2);
                break;
            default:
                logger.error("wrong operation choice");
                break;
        }
        if (result != null) {
            System.out.println("result - " + result.getRealPart() + "+" + result.getImaginaryPart() + "i");
        }


    }

    private static void performRationalCalculation(Scanner scanner) {
        System.out.println("for rational numbers - ");
        System.out.print("enter numerator 1 number");
        int numerator1 = scanner.nextInt();
        System.out.print("enter denominator 1 number");
        int denominator1 = scanner.nextInt();
        RationalNumber rational1 = new RationalNumber(numerator1, denominator1);
        rational1.reduce();

        System.out.print("enter numerator 2 number");
        int numerator2 = scanner.nextInt();
        System.out.print("enter denominator 2 number");
        int denominator2 = scanner.nextInt();
        RationalNumber rational2 = new RationalNumber(numerator2, denominator2);
        rational2.reduce();

        System.out.println("enter operation");
        System.out.println("1. Sum");
        System.out.println("2. subtract");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.print("your choice: ");
        int operation = scanner.nextInt();

//        RationalNumber result = null;
        RationalNumber result = new RationalNumber();
        switch (operation) {
            case 1:
                logger.info("sum was successfully done");
                result = result.add(rational1, rational2);
                break;
            case 2:
                logger.info("subtract was successfully done");
                result = result.subtract(rational1, rational2);
                break;
            case 3:
                logger.info("multiply was successfully done");
                result = result.multiply(rational1, rational2);
                break;
            case 4:
                logger.info("div was successfully done");
                result = result.div(rational1, rational2);
                break;
            default:
                logger.error("wrong operation choice");
                break;
        }
        if (result != null) {
            System.out.println("result - " + result.getNumerator() + "/" + result.getDenominator());
        }

    }

    private static void showMenu() {
        System.out.println("Select number type:");
        System.out.println("1. Rational numbers");
        System.out.println("2. Complex numbers");
        System.out.println("3. exit");
        System.out.print("Your choice: ");
    }

}
