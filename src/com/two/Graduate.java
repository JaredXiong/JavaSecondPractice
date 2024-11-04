package com.two;

public class Graduate implements StudentManageInterface,TecherManageInterface {
    String name;
    String sex;
    int age;
    double fee;
    double pay;

    public Graduate(String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public Double getPay() {
        return pay;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public Double getFee() {
        return fee;
    }

    public void loan(){
        if(getPay()-getFee() < 2000)
            System.out.println("Provide a loan.");
        else
            System.out.println("No loan required.");
    }
}
