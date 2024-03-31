package bai11;

import java.util.Scanner;

public class Hang {

    private String tenHang;
    private float soLuong;
    private float donGia;

    public Hang() {
    }

    public Hang(String tenHang, float soLuong, float donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên hàng: ");
        this.tenHang = sc.nextLine();
        do {
            System.out.print("Nhập số lượng: ");
            try {
                this.soLuong = Integer.parseInt(sc.nextLine());
                if (this.soLuong < 0) {
                    System.err.println("Số lượng phải là số nguyên không âm!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.err.println("Số lượng phải là số nguyên không âm!");
                continue;
            }
            break;
        } while (true);
        do {
            System.out.print("Nhập đơn giá: ");
            try {
                this.donGia = Float.parseFloat(sc.nextLine());
                if (this.donGia < 0) {
                    System.err.println("Đon giá phải là số không âm!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.err.println("Đơn giá phải là số không âm!");
                continue;
            }
            break;
        } while (true);
    }

    public float tinhTongTien() {
        return this.donGia * this.soLuong;
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %-10s %-20s %-20s\n", "Tên hàng", "Số lượng", "Đơn giá", "Thành tiền");
    }

    public void inDL() {
        System.out.printf("%-15s %-10s %-20s %-20s\n", this.tenHang, this.soLuong, this.donGia, this.tinhTongTien());
    }
}
