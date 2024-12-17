package code1;
/*请在下面标注【】的位置添加代码*/
//测试类
public class AnimalEatTest {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        //创建Dog类的对象dog并调用eat()输出“狗吃骨头”
        Dog dog = new Dog();
        dog.eat();
    }
}
//定义接口Animal
interface Animal{
    void eat();
}

//在类Cat中实现接口
class Cat implements Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

//定义类Dog，实现接口Animal
class Dog implements Animal{
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
