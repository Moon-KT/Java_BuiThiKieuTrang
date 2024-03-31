package bai10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NhanVien> nhanVien = new ArrayList<>();
        nhanVien.add(new NhanVienSanXuat("Nguyen Van A", 2010, 100000, 100));
        nhanVien.add(new NhanVienVanPhong("Tran Thi B", 2012, 100000, 5000000, 2));
        nhanVien.add(new NhanVienSanXuat("Pham Van C", 2015, 100000, 200));
        nhanVien.add(new NhanVienVanPhong("Le Thi D", 2018, 100000, 6000000, 1));

        int totalSalary = nhanVien.stream().mapToInt(NhanVien::tinhLuong).sum();
        System.out.println("Tổng số tiền lương phải trả: " + totalSalary + " VND.");
    }

}
