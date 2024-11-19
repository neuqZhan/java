////package code4_7;
////
////public class test {
////}
////class MyClass {
////    int a;
////    static int b;
////    void fa(){
////
////    }
////    static void fb(){
////
////    }
////    public void m1(){
////        System.out.println(a);    //位置1
////        System.out.println(b);    //位置2
////        fa();                     //位置3
////        fb();                     //位置4
////    }
////    public static void m2(){
////        System.out.println(a);    //位置5 静态方法不能调用实例变量
////        System.out.println(b);    //位置6
////        fa();                    //位置7 静态方法不能调用实例方法
////        fb();                    //位置8
////    }
////}
//////出错位置是：
//////
//////位置5：System.out.println(a);
//////位置7：fa();
//////原因： 静态方法无法直接访问实例变量或调用实例方法，因为它们是依赖于对象实例的，而静态方法和静态变量属于类本身，不依赖具体对象。
//class MyClass {
//    static int i = 10;
//    static {
//        i = 20;
//        System.out.println("In Static");
//    }
//    public MyClass() {
//        System.out.println("MyClass()");
//    }
//    public MyClass(int i) {
//        System.out.println("MyClass(int)");
//        this.i = i;
//    }
//}
//public class test {
//    public static void main(String args[]) {
//        MyClass mc1 = new MyClass();
//        System.out.println(mc1.i);
//        MyClass mc2 = new MyClass(10);
//        System.out.println(mc2.i);
//    }
//}
public class test{
    public static void main(String args[]){
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        mc1.a = 100;
        mc1.b = 200;
        mc2.a = 300;
        mc2.b = 400;
        System.out.println(mc1.a);
        System.out.println(mc1.b);
        System.out.println(mc2.a);
        System.out.println(mc2.b);
    }
}
class MyClass{
    static int a;
    int b;
}
