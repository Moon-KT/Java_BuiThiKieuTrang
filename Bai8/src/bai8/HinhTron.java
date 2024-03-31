package bai8;

public class HinhTron extends HinhPhang {
    double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }

    @Override
    double tinhDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }
}
