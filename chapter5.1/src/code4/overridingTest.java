package code4;

public class overridingTest {
    public static void main(String[] args) {
        // 实例化子类对象s，调用talk()方法打印信息
        /********* begin *********/
        Student s =new Student();
        s.talk("张三",18,"哈佛大学");
        /********* end *********/

    }
}

class Person {
    /********* begin *********/
    String name;
    int age;
    public void talk(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    String school;
    public  void talk(String name,int age,String school){
        System.out.printf("我是："+name+"，今年："+age+"岁，我在"+school+"上学");
    }
    /********* end *********/
}