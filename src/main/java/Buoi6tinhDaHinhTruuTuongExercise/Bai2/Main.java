package Buoi6tinhDaHinhTruuTuongExercise.Bai2;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mèo vàng");
        cat1.greets();
        System.out.println("---------------------------");
        Dog dog1 = new Dog("Cún đen");
        dog1.greets();
        dog1.greets("Woooof");
        System.out.println("---------------------------");
        BigDog bigDog1 = new BigDog("Chó mẹ");
        bigDog1.greets();
        bigDog1.greets("Woooooow");
        bigDog1.greets("Woooooooow");

    }
}
