package code3;


public class superTest {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s =new Student();
        s.name="张三";
        s.age=18;
        s.school ="哈佛大学";
        System.out.println("姓名："+s.name+"，年龄："+s.age+"，学校："+s.school);
        /********* end *********/
    }
}

class Person {
    /********* begin *********/
    String name;
    int age;

    Person() {

    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/


    String school;
    /********* end *********/
}

