package bai8;

public class Main {

    public static void main(String[] args) {
        HinhPhang hinhVuong = new HinhVuong(5);
        HinhPhang hinhChuNhat = new HinhChuNhat(5, 10);
        HinhPhang hinhTron = new HinhTron(5);

        System.out.println("Hinh vuong: Chu vi = " + hinhVuong.tinhChuVi() + ", Dien tich = " + hinhVuong.tinhDienTich());
        System.out.println("Hinh chu nhat: Chu vi = " + hinhChuNhat.tinhChuVi() + ", Dien tich = " + hinhChuNhat.tinhDienTich());
        System.out.println("Hinh tron: Chu vi = " + hinhTron.tinhChuVi() + ", Dien tich = " + hinhTron.tinhDienTich());
    }
}
