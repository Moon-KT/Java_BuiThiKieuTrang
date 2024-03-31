package bai12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class NgayThang {

    private int thang;
    private int ngay;
    private int nam;

    public NgayThang() {
    }

    public NgayThang(int thang, int ngay, int nam) {
        this.thang = thang;
        this.ngay = ngay;
        this.nam = nam;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public void nhap() {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        String d, m, y;
        
        do {
            System.out.print("Nhập ngày: ");
            d = s.nextLine();
            System.out.print("Nhập tháng: ");
            m = s.nextLine();
            System.out.print("Nhập năm: ");
            y = s.nextLine();
            String ngayKiemTra = d + "/" + m + "/" + y;
            try {
                LocalDate.parse(ngayKiemTra, dtf);
            } catch (IllegalArgumentException e) {
                System.err.println("Ngày không hợp lệ!");
            }
            this.ngay = Integer.parseInt(d);
            this.thang = Integer.parseInt(m);
            this.nam = Integer.parseInt(y);
            break;
        } while (true);
    }

    @Override
    public String toString() {
        return "Ngày (dd/mm/yyyy): " + nam + "/" + ngay + "/" + thang;
    }
}
