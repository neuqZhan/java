package code1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogName = sc.next();
        String dogSex = sc.next();
        String dogColor = sc.next();
        String catName = sc.next();
        String catSex = sc.next();
        double catWeight = sc.nextDouble();
        // 通过有参构造函数实例化Dog类对象dog
        // dog调用talk()方法
        // dog调用eat()方法
        /********* begin *********/
        Dog a = new Dog(dogName,dogSex,dogColor);
        a.talk();
        a.eat();
        /********* end *********/
        // 通过有参构造函数实例化Cat类对象cat
        // cat调用talk()方法
        // cat调用eat()方法
        /********* begin *********/
        Cat b = new Cat(catName,catSex,catWeight);
        b.talk();
        b.eat();
        /********* end *********/
    }
}

// 抽象类Pet 封装属性name和sex
// 构造函数初始化name和sex
// 声明抽象方法talk()
// 声明抽象方法eat()
abstract class Pet {
    /********* begin *********/
    public Pet(String name,String sex){

    };

     String name;
     String sex;
    abstract void talk();
    abstract void eat();
    /********* end *********/
}

// Dog类继承自Pet类 封装属性color
// 构造函数初始化name、sex和color
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，颜色：color，汪汪叫'
// eat()输出'name吃骨头'
class Dog extends Pet {
    /********* begin *********/
    String color;
    public Dog(String name,String sex,String color){
        super(name,sex);
        this.name = name;
        this.sex =sex;
        this.color =color;

    };
    public void talk(){
        System.out.println("名称："+name+"，性别："+sex+"，颜色："+color+"，汪汪叫");
    };
    public  void eat(){
        System.out.println(name+"吃骨头！");
    };
    /********* end *********/
}

// Cat类继承自Pet类 封装属性weight
// 构造函数初始化name、sex和weight
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，体重：weight kg，喵喵叫'
// eat()输出'name吃鱼'
class Cat extends Pet {
    /********* begin *********/
    Double Weight;
    public Cat(String name,String sex,Double Weight){
        super(name,sex);
        this.name = name;
        this.sex =sex;
        this.Weight =Weight;

    };


    public void talk(){
        System.out.println("名称："+name+"，性别："+sex+"，颜色："+Weight+"，喵喵叫");
    };
    public  void eat(){
        System.out.println(name+"吃鱼！");
    };
    /********* end *********/
}


//测试输入：
//泰迪
//male
//brown
//波斯猫
//male
//2.5
//预期输出：
//名称：泰迪，性别：male，颜色：brown，汪汪叫
//泰迪吃骨头！
//名称：波斯猫，性别：male，体重：2.5kg，喵喵叫
//波斯猫吃鱼！