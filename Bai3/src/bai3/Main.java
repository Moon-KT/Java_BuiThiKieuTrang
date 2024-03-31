package bai3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HeSoPT> dsPT = new ArrayList<>();

        System.out.print("Nhap so luong phuong trinh: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap he so cho phuong trinh thu " + (i + 1) + ":");
            System.out.print("a = ");
            double a = scanner.nextDouble();
            System.out.print("b = ");
            double b = scanner.nextDouble();
            System.out.print("c = ");
            double c = scanner.nextDouble();
            dsPT.add(new HeSoPT(a, b, c));
        }

        System.out.println("\nDanh sach phuong trinh sau khi nhap:");
        for (HeSoPT pt : dsPT) {
            System.out.println(pt);
        }
    }
}
