package code5;
import java.util.Arrays;
public class HelloWorld {
    public static void main(String[] args) {
        int[] scores={79,52,98,81};
        /********** Begin **********/
        //调用方法，传入成绩数组，并获取成绩的个数
        int count=scores.length;
        sort(scores);
                /********** End **********/
                System.out.println("共有"+count+"个成绩信息！");
    }
    /**
     * 功能：将考试成绩排序并输出，返回成绩的个数
     */
    /********** Begin **********/
    public static int sort( int[] scores  ) {
        // 数组从小到大排序处理
        // 打印出数组
        // 返回数组中元素的个数
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
        System.out.println("[" + scores[0] +","+ scores[1] +","+ scores[2] +","+ scores[3] + "]");
        return 0;
    }
    /********** End **********/
}
