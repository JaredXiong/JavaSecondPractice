package com.one;

public class Circle {
    //私有最终变量，初始化后无法更改
    private final double radius;
    //构造器
    public Circle(double radius) {
        this.radius = radius;
    }
    //访问器
    public double getRadius() {
        return radius;
    }
    //返回周长
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    //返回面积
    public double area() {
        return Math.PI * radius * radius;
    }
}
