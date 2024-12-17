package code2;

import java.io.*;

public class CatchException {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new      InputStreamReader(System.in));
        String str;
        /********** Begin *********/
        //补全try/catch块，异常类型为IOException
        try {
            str = reader.readLine();
            int letter = 0, space = 0, number = 0, other = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    letter++;
                } else if (Character.isDigit(ch)) {
                    number++;
                } else if (Character.isWhitespace(ch)) {
                    space++;
                } else {
                    other++;
                }
            }
            System.out.println("letter=" + letter + ",space=" + space + ",number=" + number + ",other=" + other);
        }
        catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        /********** End *********/
    }
}

//测试输入：abc123###
//测试输出：letter=3,space=0,number=3,other=3
//
//测试输入：777783 34 @ %( sds
//测试输出：letter=3,space=4,number=8,other=3