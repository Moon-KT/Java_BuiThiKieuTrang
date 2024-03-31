package bai12;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangSanhSu extends HangHoa {

    private String nsx;
    private NgayThang ngayNhapKho = new NgayThang();

    @Override
    public String danhGiaMucDoBan() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        d = c.getTime();
        c.set(ngayNhapKho.getNam(), ngayNhapKho.getThang(),
                ngayNhapKho.getNgay());
        c.roll(Calendar.DAY_OF_MONTH, 10);
        if ((slgTon > 50)
                && (d.compareTo(c.getTime())) > 0) {
            return "Bán chậm";
        } else {
            return "Bình thường";
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Năm sx:");
        nsx = sc.nextLine();
        System.out.print("Ngày nhập kho:");
        ngayNhapKho.nhap();
        ghiChu = danhGiaMucDoBan();
        VAT = 0.1;
    }

    static void inTieuDe() {
        HangHoa.inTieuDe();
        System.out.printf("%15s %20s %20s %n",
                "Nhà sx", "Ngày nhập kho", " Ghi chú");
    }

    @Override
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %20s %20s %n",
                nsx, ngayNhapKho, ghiChu);
    }
}
