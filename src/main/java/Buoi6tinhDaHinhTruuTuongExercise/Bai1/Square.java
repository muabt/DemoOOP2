package Buoi6tinhDaHinhTruuTuongExercise.Bai1;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.length;
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString(){
        return "Square[" + super.toString() + ']';
    }
}

