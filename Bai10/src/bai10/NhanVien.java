package bai10;

import java.time.Year;

public abstract class NhanVien {
    String ten;
    int namBatDau;
    int luongThuong;

    public NhanVien(String ten, int namBatDau, int luongThuong) {
        this.ten = ten;
        this.namBatDau = namBatDau;
        this.luongThuong = luongThuong;
    }

    public abstract int tinhLuong();

    public int tinhLuongThuong() {
        int years = Year.now().getValue() - this.namBatDau;
        return this.luongThuong + years * 20000;
    }
}





