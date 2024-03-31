package bai2;

public class HinhTron {

    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }

    @Override
    public String toString() {
        return "Hinh tron co ban kinh " + this.banKinh + ": Chu vi = " + this.tinhChuVi() + ", Dien tich = " + this.tinhDienTich();
    }
}
