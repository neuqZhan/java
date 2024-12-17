package code1;



/*请在下面标注【】的位置添加代码*/
//定义接口Speak，包含一个方法speak()
interface Speak{
    public void speak();
}
//测试类
public class TestInterface{
    public static void main(String[] args) {
        Speak hello = new Speak(){
            public void speak(){
                System.out.print("大家好，请多关照！");
            }
        };
        hello.speak();
    }
}
