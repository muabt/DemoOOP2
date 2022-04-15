package Buoi4tinhDongGoiExercise2;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){

    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }
    public int timUSCLN(int a, int b){
        while (a!=b){
            if (a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }
    public void toiGianPS(){
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
    }
    public void congPS(PhanSo ps){
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo tongPS = new PhanSo(ts, ms);
        tongPS.toiGianPS();
        System.out.println("Tong hai phan so = " + tongPS.tuSo + "/" + tongPS.mauSo);
    }
    public void truPS(PhanSo ps){
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo truPS = new PhanSo(ts, ms);
        truPS.toiGianPS();
        System.out.println("Hieu hai phan so = " + truPS.tuSo + "/" + truPS.mauSo);
    }

    public void nhanPS(PhanSo ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo nhanPS = new PhanSo(ts, ms);
        nhanPS.toiGianPS();
        System.out.println("Tong hai phan so = " + nhanPS.tuSo + "/" + nhanPS.mauSo);
    }

    public void chiaPS(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        PhanSo chiaPS = new PhanSo(ts, ms);
        chiaPS.toiGianPS();
        System.out.println("Thuong hai phan so = " + chiaPS.tuSo + "/" + chiaPS.mauSo);
    }
}
