package bai1;

public class HinhChuNhat {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (this.chieuDai + this.chieuRong);
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều dài là " + this.chieuDai + ", chiều rộng là " + this.chieuRong + ", chu vi là " + this.tinhChuVi() + " và diện tích là " + this.tinhDienTich();
    }
}
