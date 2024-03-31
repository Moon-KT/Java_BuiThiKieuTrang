package bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        HinhChuNhat rectangle = new HinhChuNhat(length, width);
        System.out.println(rectangle);
    }
}
