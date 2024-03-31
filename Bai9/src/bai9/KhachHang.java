package bai9;

public abstract class KhachHang {
    String id;
    String ten;
    String ngayHoaDon;
    int soLuong;
    int donGia;

    public KhachHang(String id, String ten, String ngayHoaDon, int soLuong, int donGia) {
        this.id = id;
        this.ten = ten;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public abstract double thanhTien();
}
