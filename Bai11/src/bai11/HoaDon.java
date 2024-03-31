package bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HoaDon {

    private String soHD;
    private String ngayHD;
    private int soMatHang;
    private KhachHang kh = new KhachHang();
    private List<Hang> dsHang = new ArrayList();
    private float tongTienHang = 0;

    public HoaDon() {
    }

    public HoaDon(String soHD, String ngayHD, int soMatHang, List<Hang> dsHang) {
        this.soHD = soHD;
        this.ngayHD = ngayHD;
        this.soMatHang = soMatHang;
        this.dsHang = dsHang;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public int getSoMatHang() {
        return soMatHang;
    }

    public void setSoMatHang(int soMatHang) {
        this.soMatHang = soMatHang;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public List<Hang> getDsHang() {
        return dsHang;
    }

    public void setDsHang(List<Hang> dsHang) {
        this.dsHang = dsHang;
    }

    public float getTongTienHang() {
        return tongTienHang;
    }

    public void setTongTienHang(float tongTienHang) {
        this.tongTienHang = tongTienHang;
    }

    public void nhap(List<Hang> danhSachHang) {
        if (danhSachHang.isEmpty()) {
            System.err.println("Chưa có mặt hàng nào trong cửa hàng, không thể nhập hoá đơn!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hoá đơn: ");
        this.soHD = sc.nextLine();
        System.out.print("Nhập ngày hoá đơn: ");
        this.ngayHD = sc.nextLine();
        do {
            System.out.print("Nhập số mặt hàng: ");
            try {
                this.soMatHang = Integer.parseInt(sc.nextLine());
                if (this.soMatHang < 1) {
                    System.err.println("Số mặt hàng phải nguyên dương!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.err.println("Số mặt hàng phải nguyên dương!");
                continue;
            }
            break;
        } while (true);
        this.kh.nhap();
        int luaChonGanNhat = -1;
        do {
            Hang.inTieuDe();
            for (Hang h : danhSachHang) {
                h.inDL();
            }
            do {
                System.out.print("Chọn số thứ tự của mặt hàng muốn đặt: ");
                int luaChon = -1;
                int sttToiDa = danhSachHang.size() + 1;
                try {
                    luaChon = Integer.parseInt(sc.nextLine());
                    if (luaChon < 1 || luaChon > sttToiDa) {
                        System.err.println("Số thứ tự tối thiểu là 1, tối đa là " + sttToiDa);
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Số thứ tự tối thiểu là 1, tối đa là " + sttToiDa);
                    continue;
                }
                if (luaChonGanNhat == luaChon) {
                    System.err.println("Bạn đã đặt hàng này rồi!");
                    continue;
                }
                luaChonGanNhat = luaChon;
                this.dsHang.add(danhSachHang.get(luaChon - 1));
                break;
            } while (true);
        } while (this.dsHang.size() != this.soMatHang);
        for (Hang h : dsHang) {
            this.tongTienHang += h.tinhTongTien();
        }
    }

    public void inHD() {
        System.out.println("Số hoá đơn: " + this.soHD);
        System.out.println("Ngày hoá đơn: " + this.ngayHD);
        System.out.println("Số mặt hàng: " + this.soMatHang);
        System.out.println("Thông tin khách hàng:");
        System.out.println(this.kh.toString());
        System.out.println("Thông tin về các mặt hàng đã đặt:");
        Hang.inTieuDe();
        for (Hang h : this.dsHang) {
            h.inDL();
        }
    }

    public void sapXep() {
        List<Hang> dsSapXep = new ArrayList();
        dsSapXep.addAll(this.dsHang);
        Collections.sort(dsSapXep, (Hang h1, Hang h2) -> {
            int soSanhTen = h1.getTenHang().compareTo(h2.getTenHang());
            return (soSanhTen == 0) ? (int) (h1.tinhTongTien() - h2.tinhTongTien()) : soSanhTen;
        });
        System.out.println("Số hoá đơn: " + this.soHD);
        System.out.println("Ngày hoá đơn: " + this.ngayHD);
        System.out.println("Số mặt hàng: " + this.soMatHang);
        System.out.println("Thông tin khách hàng:");
        System.out.println(this.kh.toString());
        System.out.println("Thông tin về các mặt hàng đã đặt (đã được sắp xếp):");
        Hang.inTieuDe();
        for (Hang h : dsSapXep) {
            h.inDL();
        }
    }
}
