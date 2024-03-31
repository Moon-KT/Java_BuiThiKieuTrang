package bai10;

public class NhanVienSanXuat extends NhanVien {
    int soSP;

    public NhanVienSanXuat(String ten, int namBatDau, int luongThuong, int soSP) {
        super(ten, namBatDau, luongThuong);
        this.soSP = soSP;
    }

    @Override
    public int tinhLuong() {
        return this.soSP * 10000 + this.tinhLuongThuong();
    }
}
