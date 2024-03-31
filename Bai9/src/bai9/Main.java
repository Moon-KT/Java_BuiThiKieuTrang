package bai9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KhachHang> customers = new ArrayList<>();
        customers.add(new KhachHangVN("VN01", "Nguyen Van A", "01/09/2013", 50, 2000, 30));
        customers.add(new KhachHangNuocNgoai("NN01", "John Doe", "15/09/2013", 100, 2000, "USA"));
        customers.add(new KhachHangVN("VN02", "Tran Thi B", "20/09/2013", 200, 2000, 50));
        customers.add(new KhachHangNuocNgoai("NN02", "Jane Doe", "25/09/2013", 150, 2000, "UK"));

        double totalVN = 0;
        double totalForeign = 0;
        int countForeign = 0;
        for (KhachHang customer : customers) {
            if (customer instanceof KhachHangVN) {
                totalVN += customer.thanhTien();
            } else if (customer instanceof KhachHangNuocNgoai) {
                totalForeign += customer.thanhTien();
                countForeign++;
            }
        }

        System.out.println("Thành tiền cho khách hàng Việt Nam: " + totalVN);
        System.out.println("Thành tiền cho khách hàng ngoại quốc: " + totalForeign);
        System.out.println("Thành tiền trung bình của khách hàng ngoại quốc: " + totalForeign / countForeign);
    }
    
}
