package bai8;

public class HinhChuNhat extends HinhPhang {
    double dai, rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    double tinhChuVi() {
        return (this.dai + this.rong) * 2;
    }

    @Override
    double tinhDienTich() {
        return this.dai * this.rong;
    }
}
