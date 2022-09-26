package day08;

public class Phone {
    String brand;
    double price;

    public void call() {
        System.out.println(this.brand);
        System.out.println(brand + "在打电话");
    }

    public void playGame() {
        System.out.println(brand + "在打游戏");
    }
}
