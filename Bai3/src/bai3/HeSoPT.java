package bai3;

public class HeSoPT {

    private double a, b, c;

    public HeSoPT(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String tinhNghiem() {
        if (this.a == 0) {
            if (this.b == 0) {
                return this.c == 0 ? "Phuong trinh vo so nghiem" : "Phuong trinh vo nghiem";
            } else {
                return "Phuong trinh co nghiem duy nhat: " + (-this.c / this.b);
            }
        } else {
            double delta = this.b * this.b - 4 * this.a * this.c;
            if (delta < 0) {
                return "Phuong trinh vo nghiem";
            } else if (delta == 0) {
                return "Phuong trinh co nghiem kep: " + (-this.b / (2 * this.a));
            } else {
                double sqrtDelta = Math.sqrt(delta);
                return "Phuong trinh co 2 nghiem phan biet: " + ((-this.b - sqrtDelta) / (2 * this.a)) + " va " + ((-this.b + sqrtDelta) / (2 * this.a));
            }
        }
    }

    @Override
    public String toString() {
        return "Phuong trinh: " + this.a + "x^2 + " + this.b + "x + " + this.c + " = 0, " + this.tinhNghiem();
    }
}
