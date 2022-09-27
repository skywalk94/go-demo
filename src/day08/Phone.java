package day08;

public class Phone {
    /*
     * 标准的JavaBean类
     * 类名需要见名知意
     * 成员变量使用private修饰
     * 提供至少两个构造方法：无参构造和带全部参数的构造
     * 成员方法：提供每一个成员变量对应的setXXX()和getXXX()方法
     * */

    //    JavaBean类快捷生成
    //    快捷键 ALT+INSERT
    //    或者可以下载 PTG 插件
    String brand;
    double price;

    //无参数构造
    public Phone() {
        System.out.println(123);
    }

    //带参数构造
    public Phone(int num) {
        System.out.println(num);
    }

    public void call() {
        System.out.println(this.brand);
        System.out.println(brand + "在打电话");
    }

    public void playGame() {
        System.out.println(brand + "在打游戏");
    }

}
