package bai12;

import java.util.Scanner;

public class HangDienMay extends HangHoa {

    private int thoiGianBH;
    private int congSuat;

    @Override
    public String danhGiaMucDoBan() {
        if (slgTon < 3) {
            return "Ban duoc";
        }
        return "Binh thuong";
    }

    static void inTieuDe() {
        HangHoa.inTieuDe();
        System.out.printf("%15s %10s %20s %n",
                "Thời gian bảo hành", "Công suất", "Ghi chú");
    }

    @Override
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %10s %20s %n",
                thoiGianBH, congSuat, ghiChu);
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Thời gian bảo hành:");
        thoiGianBH = Integer.parseInt(sc.nextLine());
        System.out.print("Công suất:");
        congSuat = Integer.parseInt(sc.nextLine());
        ghiChu = danhGiaMucDoBan();
    }
}
