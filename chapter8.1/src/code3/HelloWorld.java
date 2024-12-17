package code3;


public class HelloWorld {

    public void judge(String fileName,String email){
        //请在此添加实现代码
/********** Begin **********/
// 判断文件名是否以 ".java" 结尾
        if(fileName.length() ==5){
            System.out.println("Java文件名无效");
        }else if(fileName.endsWith(".java")) {
            System.out.println("Java文件名正确");
        } else {
            System.out.println("Java文件名无效");
        }

// 判断邮箱名是否有效
        int atIndex = email.lastIndexOf("@"); // 获取 @ 的索引位置
        int dotIndex = email.indexOf("."); // 获取最后一个 . 的索引位置


        if (atIndex > 0 && dotIndex > atIndex + 1 ) { // @ 存在且位于 . 之前，并且两者不相邻
            System.out.println("邮箱名正确");
        } else {
            System.out.println("邮箱名无效");
        }

/********** End **********/
    }


}
