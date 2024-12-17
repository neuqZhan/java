package code3;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String m) {
        super(m);
    }
}
public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            /********** Begin *********/
            if(num>0){
                System.out.print("The number you entered is: "+num);
            }else{
                throw new MyException("Number cannot be negative!");
            }


            /********** End *********/
        }
        catch(MyException e) {
            System.out.print(e);
        }
    }
}

//样例输入：-60
//样例输出：chapter8.step3.MyException: Number cannot be negative!
//
//样例输入：60
//样例输出：The number you entered is: 60