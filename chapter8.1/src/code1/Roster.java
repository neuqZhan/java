package code1;


import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String roster1 =scanner.nextLine();
        String roster2 =scanner.nextLine();
        int len1 = roster1.length();
        int len2 = roster2.length();
        System.out.println(len1);
        System.out.println(len2);

        // 比较字符串内容
        if (roster1.compareTo(roster2)==0 ) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }


        /********** End *********/
    }
}

//测试输入：
//张三 李四 王五 小明
//李明 张三 小明 王五
//预期输出：
//11
//11
//不相同