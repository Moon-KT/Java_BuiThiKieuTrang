package bai11;

import java.util.Scanner;

public class KhachHang {

    private String hoten;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diaChi) {
        this.hoten = hoten;
        this.diaChi = diaChi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên của bạn: ");
        this.hoten = sc.nextLine();
        System.out.print("Nhập địa chỉ của bạn: ");
        this.diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Họ và tên: " + hoten + ", địa chỉ: " + diaChi;
    }

}
