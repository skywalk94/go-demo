package day13;

public class Test {
    //    多态：对象的多种形态
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(19);

        register(s);
        register(t);
    }

    //    这个方法接收Student、Teacher
    public static void register(Person p) {
        p.show();
    }
}
