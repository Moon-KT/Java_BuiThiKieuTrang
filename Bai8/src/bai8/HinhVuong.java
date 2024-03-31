package bai8;

public class HinhVuong extends HinhPhang {
    double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    double tinhChuVi() {
        return this.canh * 4;
    }

    @Override
    double tinhDienTich() {
        return this.canh * this.canh;
    }
}
