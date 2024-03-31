package bai11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hang> dsHang = new ArrayList();
        List<HoaDon> dsHD = new ArrayList();
        String luaChon = "";
        do {
            System.out.println("===== CHƯƠNG TRÌNH QUẢN LÍ HOÁ ĐƠN BÁN HÀNG =====");
            System.out.println("1. Nhập thông tin hàng");
            System.out.println("2. Nhập thông tin hoá đơn");
            System.out.println("3. Xem toàn bộ hàng");
            System.out.println("4. Xem toàn bộ hoá đơn");
            System.out.println("5. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = sc.nextLine();
            switch (luaChon) {
                case "1" -> {
                    Hang hangMoi = new Hang();
                    hangMoi.nhap();
                    dsHang.add(hangMoi);
                }
                case "2" -> {
                    HoaDon hdMoi = new HoaDon();
                    hdMoi.nhap(dsHang);
                    if (hdMoi.getSoHD() != null) {
                        dsHD.add(hdMoi);
                    }
                }
                case "3" -> {
                    Hang.inTieuDe();
                    dsHang.forEach(Hang::inDL);
                }
                case "4" -> {
                    dsHD.forEach(HoaDon::inHD);
                }
                case "5" -> {
                    System.out.println("Đang thoát chương trình...");
                }
                default -> {
                    System.err.println("Lựa chọn phải là một số từ 1 đến 5!");
                }
            }
            if ("5".equals(luaChon)) {
                break;
            }
        } while (true);
    }

}
