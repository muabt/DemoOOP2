package Buoi9Exercise;

import java.util.List;

public class TinhToan extends PhanSo implements IPhanSo{

    public PhanSo themPhanSo(int tuSo, int mauSo){
        while (kiemTraPhanSo(tuSo,mauSo)){
            return new PhanSo(tuSo,mauSo);
        }
        return new PhanSo(tuSo,mauSo);
    }
     @Override
    public  PhanSo congPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = cong(ketQua, ps.get(i));
        }
        ketQua = toiGianPS(ketQua);
        System.out.println("Ket qua phep cong. Tu so la "+ketQua.tuSo()+" Mau so la " + ketQua.mauSo());
        return ketQua;
    }

    @Override
    public PhanSo truPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = tru(ketQua, ps.get(i));
        }
        ketQua = toiGianPS(ketQua);
        System.out.println("Ket qua phep tru. Tu so la "+ketQua.tuSo()+" Mau so la " + ketQua.mauSo());
        return ketQua;
    }

    @Override
    public PhanSo nhanPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = nhan(ketQua, ps.get(i));
        }
        ketQua = toiGianPS(ketQua);
        System.out.println("Ket qua phep nhan. Tu so la "+ketQua.tuSo()+" Mau so la " + ketQua.mauSo());
        return ketQua;
    }

    @Override
    public PhanSo chiaPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = chia(ketQua, ps.get(i));
        }
        ketQua = toiGianPS(ketQua);
        System.out.println("Ket qua phep chia. Tu so la "+ketQua.tuSo()+" Mau so la " + ketQua.mauSo());
        return ketQua;
    }
}
