package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HinhTron> dsHT = new ArrayList<>();

        System.out.print("Nhap so luong hinh tron: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hinh tron thu " + (i + 1) + ":");
            System.out.print("Ban muon nhap ban kinh (R) hay duong kinh (D)? ");
            String loai = scanner.next();
            System.out.print("Nhap gia tri: ");
            double giaTri = scanner.nextDouble();
            if (loai.equalsIgnoreCase("D")) {
                giaTri /= 2;
            }
            dsHT.add(new HinhTron(giaTri));
        }

        System.out.println("\nDanh sach hinh tron sau khi nhap:");
        for (HinhTron ht : dsHT) {
            System.out.println(ht);
        }
    }
}