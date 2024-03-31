package bai9;

public class KhachHangVN extends KhachHang {
    int heSo;

    public KhachHangVN(String id, String ten, String ngayHoaDon, int soLuong, int donGia, int heSo) {
        super(id, ten, ngayHoaDon, soLuong, donGia);
        this.heSo = heSo;
    }

    @Override
    public double thanhTien() {
        if (this.soLuong <= this.heSo) {
            return this.soLuong * this.donGia;
        } else {
            return this.heSo * this.donGia + (this.soLuong - this.heSo) * this.donGia * 2.5;
        }
    }
}
