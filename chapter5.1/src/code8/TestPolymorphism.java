package code8;


public class TestPolymorphism {
    public static void main(String[] args) {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Dog b = new Dog(); // 向上转型
        b.eat(); // 调用的是 Cat 的 eat
        Cat a = new Cat(); // 向上转型
        a.eat(); // 调用的是 Cat 的 eat
        Lion c = new Lion(); // 向上转型
        c.eat(); // 调用的是 Cat 的 eat

    }
        /********* end *********/
    }


// Animal类中定义eat()方法
class Animal {
    /********* begin *********/
    public void eat(){

    }
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal {
    /********* begin *********/
    public void eat(){
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal {
    /********* begin *********/
    public void eat(){
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal {
    /********* begin *********/
    public void eat(){
        System.out.println("eating meat...");
    }
    /********* end *********/
}

