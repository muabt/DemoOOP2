package tinhDaHinhTruuTuongExercise.Bai2;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
       //super.greets();
        System.out.println("Wooow");

    }
    @Override
    public void greets(String another){
        System.out.println(another);
    }

    public void greets(BigDog another){
        System.out.println(another);
    }
}
