package code1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading inputs for Chinese and English people's information
        String cName = sc.next();
        String cSex = sc.next();
        int cAge = sc.nextInt();
        String eName = sc.next();
        String eSex = sc.next();
        int eAge = sc.nextInt();

        // Creating Person objects (Chinese and English) via constructors
        Person person1 = new Chinese(cName, cSex, cAge);  // Chinese object
        Person person2 = new English(eName, eSex, eAge);  // English object

        // Demonstrating polymorphism by calling showEat() on both objects
        showEat(person1);
        showEat(person2);

        // Demonstrating downcasting to call subclass-specific methods
        if (person1 instanceof Chinese) {
            Chinese chinesePerson = (Chinese) person1;
            chinesePerson.shadowBoxing();  // Calling Chinese-specific method
        }

        if (person2 instanceof English) {
            English englishPerson = (English) person2;
            englishPerson.horseRiding();  // Calling English-specific method
        }
    }

    // Method that uses polymorphism to call the correct eat() method based on object type
    public static void showEat(Person person) {
        person.eat();  // Polymorphic behavior: will call either Chinese's or English's eat method
    }
}

// Abstract class Person with common properties and an abstract eat() method
abstract class Person {
    String name;
    String sex;
    int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    abstract void eat();
}

// Chinese class extends Person and provides specific implementations
class Chinese extends Person {

    public Chinese(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void eat() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age + "，我是中国人，我喜欢吃饭！");
    }

    // Chinese-specific method
    public void shadowBoxing() {
        System.out.println(name + "在练习太极拳！");
    }
}

// English class extends Person and provides specific implementations
class English extends Person {

    public English(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void eat() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age + "，我是英国人，我喜欢吃三明治!");
    }

    // English-specific method
    public void horseRiding() {
        System.out.println(name + "在练习骑马！");
    }
}
//测试输入：
//张三
//男
//20
//史蒂文
//男
//22
//预期输出：
//姓名：张三，性别：男，年龄：20，我是中国人，我喜欢吃饭!
//姓名：史蒂文，性别：男，年龄：22，我是英国人，我喜欢吃三明治!
//张三在练习太极拳!
//史蒂文在练习骑马！