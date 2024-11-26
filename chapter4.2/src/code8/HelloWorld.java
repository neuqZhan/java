package code8;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        int[] scores ={5,7,12,9,32};
        getSum(1,2);
        getAvg(1,2,3);
        printRect(2,3);
        sortArr(scores);
//        print99();
    }
    /********** Begin **********/
    /**
     * 第一题：定义一个方法 接收两个整数类型的参数 a和b，返回两个数的和  返回值类型为int 方法名为：getSum
     */
    public static int getSum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }


    /**
     * 第二题： 定义一个方法 接收三个double类型参数a，b，c， 返回这三个数的平均值 返回值类型为double 方法名为：getAvg
     */
    public static double getAvg(double a,double b,double c){
        System.out.println((a+b+c)/3);
        return (a+b+c)/3;
    }


    /**
     * 第三题： 定义一个方法 接收两个参数 a 和b 打印a行 b列的一个矩形  不需要返回值   方法名为：printRect
     */
    public static void printRect(int a, int b){
        for (int i = 0; i <a; i++) {
            System.out.println("\n");
            for (int j = 0; j <b; j++) {
                System.out.print("*");
            }

        }

    }

	
	/**
	 * 第四题：定以一个方法，接收整形数组 为参数  对这个数组进行升序排序  最后输出该数组 不需要返回值 方法名为 sortArr  
	 */
    public static void sortArr(int[] scores){
        int a;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < i; j++) {
                if (scores[i] < scores[j]) {
                    a = scores[i];
                    scores[i] = scores[j];
                    scores[j] = a;
                }
            }
        }
        System.out.println("\n");
        for (int j = 0; j < scores.length; j++) {
            System.out.print(scores[j]+" ");
        }
    }

	
    /**
     *  第五题
     * 你只需要实现for 循环括号的内容就可 ，打印语句系统已经给你完成 
     */
//    public static void Print99() {
//        for (int i=1 ;i<10;i++  ) {
//            for(int j =1;j<i+1; j++) {
//                System.out.print(j + " * " + i + " = " + i * j + "\t");
//            }
//            System.out.println();
//        }
//    }

    /********** End **********/
    
    
}	
