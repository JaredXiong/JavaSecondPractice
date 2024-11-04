package com.one;

public class Lader {
    private final double upBottom;
    private final double lowBottom;
    private final double height;
    public Lader(double upBottom, double lowBottom, double height) {
        this.upBottom = upBottom;
        this.lowBottom = lowBottom;
        this.height = height;
    }
    public double getUpBottom() {
        return upBottom;
    }
    public double getLowBottom() {
        return lowBottom;
    }
    public double getHeight() {
        return height;
    }
    public double area(){
        return ((upBottom+lowBottom)*height/2);
    }
}
