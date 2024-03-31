package bai12;

import java.util.Scanner;

public abstract class HangHoa {

    protected String maHang;
    protected String tenHang;
    protected String ghiChu;
    protected double donGia;
    protected double slgTon;
    protected double VAT;

    public abstract String danhGiaMucDoBan();

    public String getGhiChu() {
        return ghiChu;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Mã hàng:");
        maHang = sc.nextLine();
        System.out.print(" Tên hàng:");
        tenHang = sc.nextLine();
        System.out.println("Đơn giá:");
        donGia = sc.nextDouble();
        System.out.print("Số lượng tồn kho");
        slgTon = sc.nextDouble();
    }

    public String getMaHang() {
        return maHang;
    }

    static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s",
                "Mã hàng", "tên hàng", "đơn giá", "số lượng", "VAT");
    }

    public void inDL() {
        System.out.printf("%10s %10s %10.1f %10.1f %10.1f",
                maHang, tenHang, donGia, slgTon, VAT);

    }
}