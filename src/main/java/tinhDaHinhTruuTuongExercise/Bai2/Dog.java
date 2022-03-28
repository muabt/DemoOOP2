package tinhDaHinhTruuTuongExercise.Bai2;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woof");
    }

    public void greets(String another){
        System.out.println(another);
    }

}
