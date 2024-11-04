package com.one;

public class Trangle {
    private double a,b,c;
    public Trangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double perimeter() {
        return a+b+c;
    }
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a)+(p - b)+(p - c));
    }
    public boolean isTriangle() {
        return(a+b>c && a+c>b && b+c>a);
    }
}
