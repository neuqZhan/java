package code4;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  //获取第一个输入的整数
        int j = sc.nextInt();  //获取第二个输入的整数

        /********** Begin **********/
        //在这里调用方法获取返回值
        System.out.println(i + "和" + j + "比较，最大值是：" +getMax(i,j)   );
        /********** End **********/
    }

    /*在这里创建getMax方法，以两个整数作为参数，返回两个整数中较大的值*/

    /********** Begin **********/
    public static int getMax(int i,int j){
        int a;
        if(i>j) {
             a=i;
        } else {
             a=j;
        }

        return a;

    }
    /********** End **********/
}
