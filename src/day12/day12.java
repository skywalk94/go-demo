package day12;

public class day12 {
    public static void main(String[] args) {
        Student S = new Student();
        S.lunch();
    }
}

class Person {
    public Person() {
        System.out.println("直接触发");
    }

    public void eat() {
        System.out.println("吃米饭");
    }

    public void drink() {
        System.out.println("喝热水");
    }
}

class Student extends Person {
    public void lunch() {
        this.eat();
        super.eat();
    }

    //方法重写：子类跟父类有相同的方法名，需要添加注解@Override
    @Override
    public void eat() {
        System.out.println("吃零食");
    }

    @Override
    public void drink() {
        System.out.println("喝汽水");
    }
}

