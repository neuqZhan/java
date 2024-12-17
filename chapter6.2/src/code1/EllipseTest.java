package code1;
/* 请在下面标注【】的位置补充代码。

 */

import java.util.Scanner;
//定义接口 Area，包含抽象方法area():计算面积
interface Area {
    abstract double area();
}
//定义接口 Perimeter，包含抽象方法perimeter():计算周长
interface Perimeter {
    abstract double perimeter();
}


//定义椭圆类，实现接口Area、Perimeter
class Ellipse implements Area,Perimeter{
    private  double longAxis;   //长半轴
    private  double shortAxis;  //短半轴
    //构造方法
    public Ellipse(double longAxis, double shortAxis)
    {
        this.longAxis = longAxis;
        this.shortAxis = shortAxis;
    }
    //重写（或实现）Area接口中的抽象方法area()
    @Override
    public double area()
    {
        return 3.14*longAxis*shortAxis;
    }

    //实现Perimeter接口中的抽象方法perimeter()
    @Override
    public double perimeter() {
        return 2*3.14*shortAxis+4*(longAxis-shortAxis);
    }

    //显示椭圆对象的信息
    public void display()
    {
        System.out.printf("椭圆的长半轴:%.2f,短半轴:%.2f",this.longAxis,this.shortAxis);
        System.out.printf(",面积:%.2f,周长:%.2f\n",area(),perimeter());
    }
}

//测试类
public class EllipseTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b;
        a = sc.nextDouble();  //长半轴
        b = sc.nextDouble();  //短半轴
        Ellipse ellipse = new Ellipse(a,b);
        ellipse.display();
    }
}
//测试输入：
//6  4；
//预期输出：
//椭圆的长半轴:6.00,短半轴:4.00,面积:75.36,周长:33.12
//
//提示：
//输出结果中的标点符号均为英文半角