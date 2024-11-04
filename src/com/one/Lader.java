package com.one;

public class Lader {
    //私有最终变量，初始化后无法更改
    private final double upBottom;
    private final double lowBottom;
    private final double height;
    public Lader(double upBottom, double lowBottom, double height) {
        this.upBottom = upBottom;
        this.lowBottom = lowBottom;
        this.height = height;
    }
    //访问器
    public double getUpBottom() {
        return upBottom;
    }
    public double getLowBottom() {
        return lowBottom;
    }
    public double getHeight() {
        return height;
    }
    //返回面积
    public double area(){
        return ((upBottom+lowBottom)*height/2);
    }
}
