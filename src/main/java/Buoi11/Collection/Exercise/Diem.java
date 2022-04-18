package Buoi11.Collection.Exercise;

public class Diem {
    private String maSV, maMH;
    private int diem;

    public Diem() {
    }

    public Diem(String maSV, String maMH, int diem) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    @Override
    public String toString() {
        return "Diem[" +
                "diem=" + diem +
                ']';
    }
}
