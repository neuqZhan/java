package code5;

public class abstractTest {
    public static void main(String[] args) {
        /********* begin *********/
        // 分别实例化Student类与Worker类的对象，并调用各自构造方法初始化类属性。
        Student s =new Student("张三",20,"学生");
        s.talk("张三",20,"学生");
        // 分别调用各自类中被复写的talk()方法 打印信息。
        Worker w =new Worker ("李四",30,"工人");
        w.talk("李四",30,"工人");
        /********* end *********/

    }
}

// 声明一个名为Person的抽象类，在Person中声明了三个属性name age occupation和一个抽象方法——talk()。
abstract class Person {
    /********* begin *********/
    String name;
    int age;
    String occupation;
    abstract void talk(String name,int age,String occupation);
    /********* end *********/
}

// Student类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Student extends Person {
    /********* begin *********/
    Student(String name,int age,String occupation){}
    void talk(String name, int age, String occupation) {
        System.out.println(occupation+"——>姓名："+name+"，年龄："+age+"，职业："+occupation+ "！");
    }
    /********* end *********/
}

// Worker类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Worker extends Person {
    /********* begin *********/
    Worker(String name,int age,String occupation){}
    public void talk(String name,int age,String occupation) {
        System.out.println(occupation+"——>姓名："+name+"，年龄："+age+"，职业："+occupation+ "！");
    }
    /********* end *********/

}
