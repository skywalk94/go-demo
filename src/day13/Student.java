package day13;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生的信息为：" + getName() + "," + getAge());
    }
}
