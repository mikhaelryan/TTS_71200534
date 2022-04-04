package com.rplbo.pecahan;

public class Mathematics {
    private int numerator;
    private int denominator;

    public Mathematics(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction division(Fraction f1, Fraction f2){
        return f1/f2;
    }

    private int factorize(int a, int b){

    }

    public Fraction multiplications(Fraction f1, Fraction f2){
        return f1*f2;
    }

    public Fraction simplifyFraction(int a, int b){

    }

    public Fraction substraction (Fraction f1, Fraction f2){
        return f1-f2;
    }

    public Fraction summation(Fraction f1, Fraction f2){
        return f1+f2;
    }
}
