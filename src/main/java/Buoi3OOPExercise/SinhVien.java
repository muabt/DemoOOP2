package Buoi3OOPExercise;

public class SinhVien {
        //Attributes private
        private int maSV;
        private String hoTen;
        private float diemLT;
        private float diemTH;
        //Constructor mặc định
        public SinhVien(){

            }
         //Constructor thứ 2
        public SinhVien(int maSV, String hoTen, float diemLT, float diemTH){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
            }
        //Methods
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }
    public float diemTB(){
        return (diemLT + diemTH) / 2;
    }

    public String toString() {
        return "QuanLySV{" + "MaSV=" + maSV +
                "hoTen='" + hoTen + "diemTB" + diemTB() + '\'' +
                '}';
    }
    public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSV, hoTen, diemLT, diemTH, diemTB());
    }

}
