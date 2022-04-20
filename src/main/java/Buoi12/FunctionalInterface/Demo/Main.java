package Buoi12.FunctionalInterface.Demo;

public class Main {

    interface Calculator{
        //Phép toán với 2 số thực a, b -> đều trả về 1 số thực
        double operator(double a, double b);

    }
    public static void main(String[] args) {
        //Lamda
        Calculator sum = (a, b)->{
            return a + b;
        };
        System.out.println(sum.operator(5,6));

        //Tính biểu thức 2a + 5b + 10;
        Calculator express = (a,b)-> {
            return 2*a + 5* b +10;
        };
        System.out.println(express.operator(1,2));
    }
}
