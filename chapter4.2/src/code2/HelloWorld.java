package code2;

import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args) {
        /*begin*/
        //调用calcAvg()方法，并将返回值保存在变量avg中
        double avg = calcAvg();
                /*end*/
                System.out.println("平均成绩为："+avg);
    }
    // 定义一个返回值为double类型的方法
    /********** Begin **********/
    public static double calcAvg() {
        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2; // 计算平均值
        return avg;
        // 使用return返回值
/********** End **********/
    }
}
