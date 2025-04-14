import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    
    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            System.out.println("Chiều dài phải lớn hơn 0.");
        }
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            System.out.println("Chiều rộng phải lớn hơn 0.");
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật [chiều dài = " + chieuDai +
               ", chiều rộng = " + chieuRong +
               ", diện tích = " + tinhDienTich() +
               ", chu vi = " + tinhChuVi() + "]";
    }
}

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat();

        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        hcn.setChieuDai(chieuDai);
        hcn.setChieuRong(chieuRong);

        System.out.println(hcn);
    }
}
