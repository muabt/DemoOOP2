package Buoi7tinhTruuTuongInterface;

   public class Dog extends Animal{
        public Dog(String name, String color, String size) {
            super(name, color, size);
        }
        @Override
        public void makeSound() {
            System.out.println("Gau gau");
        }
        @Override
        public void move() {
            System.out.println("Di chuyen bang 4 chan");
        }

}
