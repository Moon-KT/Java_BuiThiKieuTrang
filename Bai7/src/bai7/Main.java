package bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SinhVien> dsSV = new ArrayList<>();
 
        dsSV.add(new SinhVien("SV01", "Nguyen Van A", 7.0, 8.0));
        dsSV.add(new SinhVien("SV02", "Tran Thi B", 6.0, 7.5));
        dsSV.add(new SinhVien("SV03", "Le Van C", 8.0, 9.0));
        dsSV.add(new SinhVien("SV04", "Pham Thi D", 5.0, 6.5));

        for (SinhVien sv : dsSV) {
            System.out.println(sv);
        }

        Collections.sort(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                int sComp = sv1.hoTen.compareTo(sv2.hoTen);
                if (sComp != 0) {
                    return sComp;
                } else {
                    return Double.compare(sv1.diemLT, sv2.diemLT);
                }
            }
        });

        System.out.println("\nDanh sach sinh vien sau khi sap xep:");
        for (SinhVien sv : dsSV) {
            System.out.println(sv);
        }

        SinhVien svMax = dsSV.get(0), svMin = dsSV.get(0);
        for (SinhVien sv : dsSV) {
            if (sv.tinhDiemTB() > svMax.tinhDiemTB()) {
                svMax = sv;
            }
            if (sv.tinhDiemTB() < svMin.tinhDiemTB()) {
                svMin = sv;
            }
        }

        System.out.println("\nSinh vien co diem trung binh cao nhat: " + svMax);
        System.out.println("Sinh vien co diem trung binh thap nhat: " + svMin);
    }
}
