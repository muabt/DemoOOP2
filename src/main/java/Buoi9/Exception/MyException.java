package Buoi9.Exception;

public class MyException extends ArithmeticException{
    @Override
    public String getMessage() {
        return "Không thực hiện được phép chia cho 0";
    }
}
