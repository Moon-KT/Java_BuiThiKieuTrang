package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<NhanVien> dsNV = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.print("Ma NV: ");
            String maNV = scanner.nextLine();
            System.out.print("So SP: ");
            int soSP = Integer.parseInt(scanner.nextLine());
            dsNV.add(new NhanVien(maNV, soSP));
        }

        NhanVien.xuatTieuDe();
        for (NhanVien nv : dsNV) {
            System.out.println(nv);
        }
    }
}
