package com.one;

public class Trangle {
    private double a,b,c;//三角形三边
    //构造方法
    public Trangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //三个访问器
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    //一个更改器
    public void change(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //普通烫发，返回周长
    public double perimeter() {
        return a+b+c;
    }
    //普通方法，返回面积
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a)+(p - b)+(p - c));
    }
    //判断三边能否构成三角形，返回布尔类型
    public boolean isTriangle() {
        return(a+b>c && a+c>b && b+c>a);
    }
}
