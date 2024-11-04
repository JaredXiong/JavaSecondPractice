package com.one;

public class Test {
    public static void main(String[] args) {
        Trangle t1 = new Trangle(3,4,5);
        Lader l1 = new Lader(3,5,3);
        Circle c1 = new Circle(5.);

        System.out.println(t1.area());
        System.out.println(t1.perimeter());
        System.out.println("当三角形三边分别为"+t1.getA()+"、"+t1.getB()+"、"+t1.getC()+"时，");
        System.out.println("判断三边能否构成三角形的结果是："+t1.isTriangle());
        t1.change(15,4,7);
        System.out.println("当三角形三边分别为"+t1.getA()+"、"+t1.getB()+"、"+t1.getC()+"时，");
        System.out.println("判断三边能否构成三角形的结果是："+t1.isTriangle());
        System.out.println(l1.area());
        System.out.println(c1.area());
    }
}
