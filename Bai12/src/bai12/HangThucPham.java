package bai12;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends HangHoa {

    private NgayThang ngaySX;
    private NgayThang ngayHetHan;
    private String nhaCungCap;

    @Override
    public String danhGiaMucDoBan() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        c.set(ngayHetHan.getNam(), ngayHetHan.getThang()
                - 1, ngayHetHan.getNgay());
        if ((slgTon != 0) && (d.compareTo(c.getTime())) > 0) {
            return "Kho ban";
        } else {
            return "Binh thuong";
        }
    }

    static void inTieuDe() {
        HangHoa.inTieuDe();
        System.out.printf("%15s %10s %15s %20s %n",
                "Ngày sx", "Ngày hết hạn", "Nhà cc", " Ghi chú");
    }

    @Override
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %10s %15s %20s %n",
                ngaySX, ngayHetHan, nhaCungCap, ghiChu);
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhà cung cấp:");
        nhaCungCap = sc.nextLine();
        System.out.print("Ngày sx:");
        ngaySX = new NgayThang();
        ngaySX.nhap();
        System.out.print("Ngày hết hạn");
        ngayHetHan = new NgayThang();
        ngayHetHan.nhap();
        ghiChu = danhGiaMucDoBan();
        VAT = 0;
    }
}
