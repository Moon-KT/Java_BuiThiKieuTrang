package bai10;

public class NhanVienVanPhong extends NhanVien {

    int luong;
    int soNgayNghi;

    public NhanVienVanPhong(String ten, int namBatDau, int luongThuong, int luong, int soNgayNghi) {
        super(ten, namBatDau, luongThuong);
        this.luong = luong;
        this.soNgayNghi = soNgayNghi;
    }

    @Override
    public int tinhLuong() {
        return this.luong - this.soNgayNghi * 10000 + this.tinhLuongThuong();
    }
}
