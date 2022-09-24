package day07;

public class day07 {
    public static void main(String[] args) {
        method();
        method1("传递参数");
        System.out.println(method2());
    }

    // 定义一个方法
    public static void method() {
        System.out.println("打印");
    }

    // 带参数的方法
    public static void method1(String param) {
        System.out.println(param);
    }

    // 方法的重载：同类同名不同参数
    public static void method1(int param) {
        System.out.println(param);
    }

    // 返回值的方法
    public static int method2() {
        return 123;
    }
}
