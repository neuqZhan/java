package code4_3;
/*定义圆锥，数据包括底(圆 buttom)、高度height、体积;
 不含参数的构造方法；设置圆锥的方法（参数包括底面半径、高）；
 显示圆锥的半径、底面积、高、体积，格式见任务说明。
*/


public class Cone {
	Circle buttom;    //圆锥的底，圆
	double height;
	double volume;
    //圆锥的构造方法 ，
	public Cone()
	{
		this.buttom=new Circle();
	}
    //设置圆锥信息
	public void set(double radius,double height)
	{
		buttom.setRadius(radius);
		this.height =height;

	}

	public double getVolume()
	{
		return (buttom.getArea()*height)/3;
	}
	public void disaplay()
	{
		buttom.display();
		System.out.printf("高：%.2f体积：%.2f\n",height ,getVolume() );
	}
}