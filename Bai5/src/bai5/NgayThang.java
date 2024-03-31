package bai5;

public class NgayThang {

    private int thang;
    private int ngay;
    private int nam;

    public NgayThang(int thang1, int ngay1, int nam1) {
        if (thang1 > 0 && thang1 <= 12) {
            this.thang = thang1;
        } else {
            this.thang = 1;
            System.out.println("Tháng " + thang1 + " không hợp lệ. đặt lại tháng = 1.");
        }
        nam = nam1;
        ngay = checkDay(ngay1);
        System.out.println("ngày tháng " + toString());
    }

    private int checkDay(int ngayKiemTra) {
        int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (ngayKiemTra > 0 && ngayKiemTra <= ngayTrongThang[thang]) {
            return ngayKiemTra;
        } else if (((thang == 2) && (ngayKiemTra == 29))
                && ((nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100
                != 0)))) {
            return ngayKiemTra;
        } else {
            System.out.println("ngày " + ngayKiemTra + " không hợp lệ, đặt lại = 1.");
            return 1;
        }
    }

    public String toString() {
        return thang + "/" + ngay
                + "/" + nam;
    }
}
