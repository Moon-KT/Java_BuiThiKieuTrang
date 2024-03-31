package bai6;

public class NhanVien {

    private String maNV;
    private int soSP;

    public NhanVien() {
        this.maNV = "";
        this.soSP = 0;
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP > 0 ? soSP : 0;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP > 0 ? soSP : 0;
    }

    public boolean coVuotChuan() {
        return this.soSP > 500;
    }

    public String getTongKet() {
        return this.coVuotChuan() ? "Vuot" : "";
    }

    public double getLuong() {
        if (this.coVuotChuan()) {
            return 500 * 20000 + (this.soSP - 500) * 30000;
        } else {
            return this.soSP * 20000;
        }
    }

    public static void xuatTieuDe() {
        System.out.println("Ma NV\t\tSo SP\t\tLuong\t\tTong ket");
    }

    @Override
    public String toString() {
        return this.maNV + "\t\t" + this.soSP + "\t\t" + this.getLuong() + "\t\t" + this.getTongKet();
    }
}
