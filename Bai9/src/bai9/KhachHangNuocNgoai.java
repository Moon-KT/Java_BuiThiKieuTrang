package bai9;

public class KhachHangNuocNgoai extends KhachHang {
    String quocTich;

    public KhachHangNuocNgoai(String id, String ten, String ngayHoaDon, int soLuòng, int donGia, String quocTich) {
        super(id, ten, ngayHoaDon, soLuòng, donGia);
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return this.soLuong * this.donGia;
    }

}
