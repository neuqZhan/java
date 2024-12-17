package code2;

import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        // 读入数据
        String data = scanner.nextLine();
        String name = scanner.nextLine();

        int index = 0; // 起始位置
        while ((index = data.indexOf(name, index)) != -1) { // 查找目标名字的位置
            System.out.println(index); // 输出当前找到的位置
            index += name.length();    // 将索引移动到当前找到的位置之后，避免重复匹配
        }


        /********** End *********/
    }
}
//测试输入：
//我嗨李四各位哦给李四复位后发我肥沃李四放我访问后李樊红伟四分嚄嚄嚄范围李四佛为红包蓝色配个好玩李四
//李四
//预期输出：
//2
//8
//17
//35
//47