package bai12;

import java.util.Scanner;

public class QLSieuThiDemo {
    static HangHoa dsHang[];
    static int n;

    static void nhapHang() {
        int chon, j, i = 0;
        System.out.println("Nhập số lượng hàng trong siêu thị = ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        dsHang = new HangHoa[n];
        do {
            System.out.println("Nhập: 1- điện máy; 2- sành sứ; 3.thực phẩm");
            chon = s.nextInt();
            HangHoa h;
            if (chon == 1) {
                h = new HangDienMay();
            } else if (chon == 2) {
                h = new HangSanhSu();
            } else {
                h = new HangThucPham();
            }
            h.nhap();
            for (j = 0; j < i; j++) {
                if (h.getMaHang().equalsIgnoreCase(dsHang[j].getMaHang())) {
                    System.out.println("Hàng đã tồn tại");
                    break;
                }
            }
            if (i == j) {
                dsHang[i] = h;
                i = i + 1;
            }
        } while (i < n);
    }

    static void inDSHang() {
        System.out.println("Danh sach hang sanh su:");
        HangSanhSu.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (dsHang[i] instanceof HangSanhSu) {
                dsHang[i].inDL();
            }
        }
        System.out.println("Danh sách hàng điện máy:");
        HangDienMay.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (dsHang[i] instanceof HangDienMay) {
                dsHang[i].inDL();
            }
        }
        System.out.println("Danh sách hàng thực phẩm:");
        HangThucPham.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (dsHang[i] instanceof HangThucPham) {
                dsHang[i].inDL();
            }
        }
    }

    public static void main(String[] args) {
        nhapHang();
        inDSHang();
    }
}
