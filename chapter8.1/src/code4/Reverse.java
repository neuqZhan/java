package code4;


public class Reverse {

    public static StringBuffer start(String data) {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/

// 先将整个字符串反转
        String reversed = new StringBuffer(data).reverse().toString();

// 按空格分割反转后的字符串
        String[] words = reversed.split(" ");

// 遍历分割后的单词数组，将单词重新拼接并加空格
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) { // 单词之间加空格，最后一个单词后不加
                ans.append(" ");
            }
        }

        /********** End *********/
        return ans;
    }
}

//测试输入：
//
//oT eb ro ton ot eb
//
//预期输出：
//
//To be or not to be