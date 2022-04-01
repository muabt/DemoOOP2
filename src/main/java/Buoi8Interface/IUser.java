package Buoi8Interface;

public interface IUser {
    //Dang nhap
    public boolean login(String user, String pass);
    //Dang xuat
    public void logout();
    //Xem thong tin ca nhan
    public void showInfo();
}
