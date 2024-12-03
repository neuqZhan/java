package code1;

public class TestPersonDemo {
    public static void main(String[] args) {
        /********* begin *********/
        // 声明并实例化一Person对象p
        Person p =new Person();
        // 给p中的属性赋值
        String name ="张三";
        int age =18;
        p.setName(name);
        p.setAge(age);
        // 调用Person类中的talk()方法
        p.talk();
        /********* end *********/

    }
}

// 在这里定义Person类
class Person {
    /********* begin *********/
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public   void talk() {

        System.out.print("我是："+name);
        System.out.print("，今年："+age+"岁");

    }
    /********* end *********/
}
