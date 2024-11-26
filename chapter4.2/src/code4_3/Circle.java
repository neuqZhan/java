package code4_3;
/**
 *定义圆类，数据成员有半径radius、面积area；
 * 方法有3个，设置圆的信息（参数是半径），获取圆的面积
 */


public class Circle {
    double radius;
    double area;

    //设置圆的信息
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //获取圆的面积
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.printf("圆的半径：%.2f 底面积：%.2f", radius, getArea());
    }
}

