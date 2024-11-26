//请在下面的【】处补充代码
import java.util.Scanner;
//主程序类
public class MainTest {
    public static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AddressBook  book =new AddressBook ();
		book.add();
		book.add();
		book.add();
		book.showList();	
        sc.close();
		sc.next();
	}
}
//朋友类Friend: 姓名、电话、单位，输入个人信息和显示个人信息
class Friend{
	String name;
	String telphone;
	String unit;  
	
	
	public  void input( ) {
		System.out.println("输入一个朋友的姓名：");
		name = MainTest.sc.next();                                //提示：引用类外的sc，需要用 类名.sc
		System.out.println("输入电话：");
		telphone =MainTest.sc.next();
		System.out.println("输入单位名称：");
		unit = MainTest.sc.next();
	}
		
	public void show() {
		System.out.printf("姓名：%8s,电话：%14s,单位：%20s\n", name,telphone,unit);
	}
}

//通讯录类：
class AddressBook{
	Friend[] book;    //book表示通讯录数组
	int count ;      //人数
	//构造方法：设Friend数组的长度为50
	public AddressBook() {

		book = new Friend[50];
	}
	//添加一个朋友：创建一个Friend对象，调用input()方法输入该对象，然后将该对象添加到数组中下标为count的元素中
	public void add() {
		Friend a = new Friend();
		a.input();
		book[count]=a;
		count=count+1;

	}
	//显示朋友列表：显示所有数组元素的信息
	public void showList() {
		for(int k=0;k<count;k++)
			book[k].show();
	}	
}