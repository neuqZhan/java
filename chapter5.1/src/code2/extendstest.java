package code2;


public class extendstest {
    public static void main(String args[]) {
        // 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Cat a =new Cat();
        a.setName("大花猫");
        a.setAge(6);
        a.voice();
        a.eat();
        a.talk();
        /********* end *********/

        // 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Dog b =new Dog();
        b.setName("大黑狗");
        b.setAge(8);
        b.voice();
        b.eat();
        b.talk();
        /********* end *********/

    }
}

class Animal {
    /********* begin *********/
    private String name;
    private int age;
    public void setName(String name){
        this.name =name;

    }
    public void setAge(int age){
        this.age =age;

    }
    public void talk(){
        System.out.println(name+age+"岁");
    }
    /********* end *********/

}

class Cat extends Animal {
    // 定义Cat类的voice()和eat()方法
    /********* begin *********/
    public void voice(){
        System.out.println("大花猫喵喵叫");
    }
    public void eat(){
        System.out.println("大花猫吃鱼");
    }

    /********* end *********/
}

class Dog extends Animal {
    // 定义Dog类的voice()和eat()方法
    /********* begin *********/
    public void voice(){
        System.out.println("大黑狗汪汪叫");
    }
    public void eat(){
        System.out.println("大黑狗吃骨头");
    }
    /********* end *********/
}
