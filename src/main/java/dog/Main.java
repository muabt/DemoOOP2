package dog;

public class Main {
    public static void main(String[] args) {
        //Tạo ra 1 đối tượng dog
        Dog dog1 = new Dog();
        dog1.breed = "Pitbull";
        dog1.age = 1;
        dog1.size = "Normal";
        dog1.color = "black-white";

        //Thực hiện 1 số hành động
        dog1.eat();
        dog1.run();
        dog1.sleep();

        //Tạo 1 đối tượng dog2
        Dog dog2 = new Dog();
        dog2.breed = "Chow chow";
        dog2.size = "Midium";
        dog2.age = 3;
        dog2.color = "Brownb";

        dog2.eat();
        dog2.run();
        dog2.sleep();

    }
}
