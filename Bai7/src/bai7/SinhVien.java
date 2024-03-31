package bai7;

public class SinhVien {

    String maSV;
    String hoTen;
    double diemLT;
    double diemTH;

    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.diemLT = 0.0;
        this.diemTH = 0.0;
    }

    public SinhVien(String maSV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public double tinhDiemTB() {
        return (this.diemLT + this.diemTH) / 2;
    }

    @Override
    public String toString() {
        return "Ma SV: " + this.maSV + ", Ho ten: " + this.hoTen + ", Diem LT: " + this.diemLT + ", Diem TH: " + this.diemTH + ", Diem TB: " + this.tinhDiemTB();
    }
}
