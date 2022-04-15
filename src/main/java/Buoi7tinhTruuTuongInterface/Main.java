package Buoi7tinhTruuTuongInterface;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Animal: ko tạo được được đối tượng từ lớp trừu tượng!
        // Animal animal = new Animal();
        Dog dog = new Dog("Pitbull", "Black", "Big");
        dog.makeSound();
        dog.move();
    }
}
