package com.two;

import java.util.Scanner;

public class TestGraduate {
    public static void main(String[] args) {
        Graduate postGraduate = new Graduate("zhangsan","man",25);
        System.out.println("Please enter zhangsan's university fees and payroll:");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double p = sc.nextDouble();
        postGraduate.setFee(f);
        postGraduate.setPay(p);
        postGraduate.loan();
    }
}
