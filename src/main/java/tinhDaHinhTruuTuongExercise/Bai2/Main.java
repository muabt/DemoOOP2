package tinhDaHinhTruuTuongExercise.Bai2;

public class Main {
    public static void main(String[] args) {
        //Using the subclasses
        Cat cat1 = new Cat("Mèo vàng");
        cat1.greets();
        Dog dog1 = new Dog("Cún đen");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Chó mẹ");
        //bigDog1.greets();

        //Using Polymorphism
        Animal animal1 = new Cat("Mèo đen");
        animal1.greets();
        Animal animal2 = new Dog("Cún vàng");
        animal2.greets();
        Animal animal3 = new BigDog("Chó mẹ 2");
        //animal3.greets();

         //
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);

    }
}
