package bai5;

public class NhanVien {

    private String hoDem;
    private String ten;
    private NgayThang ngaySinh;
    private NgayThang ngayVaoLam;

    public NhanVien() {
        hoDem = "";
        ten = "";
        ngaySinh = new NgayThang(0, 0, 0);
        ngayVaoLam = new NgayThang(0, 0, 0);
    }

    public NhanVien(String hoDem, String ten, NgayThang ngaySinh, NgayThang ngayVaoLam) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String toString() {
        return ten + ", " + hoDem + " ngay vao lam: " + ngayVaoLam
                + " sinh ngay: " + ngaySinh;
    }
}
