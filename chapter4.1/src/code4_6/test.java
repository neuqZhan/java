package code4_6;

public class test {
    /********** Begin **********/
    static String name = "楚留香";

    static{
        System.out.println("hello educoder");//加上static,静态代码块是不需要依赖`main`方法就可以独立运行的
    }
    public static void main(String[] args) {
        System.out.println("我叫" + name);//静态变量可以直接使用
        study();//静态变量可以直接使用
    }

    public static void study(){
        System.out.println("我喜欢在educoder上学习java");
    }
    /********** End **********/
}
