import java.util.Scanner;

class SinhVien {
    private int mssv;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this.mssv = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }

    public SinhVien(int mssv, String hoTen, float diemLT, float diemTH) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return mssv + "\t" + hoTen + "\t" + diemLT + "\t" + diemTH + "\t" + tinhDiemTB();
    }
}

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(11111, "Nguyen Van Thanh", 8.5f, 7.5f);
        SinhVien sv2 = new SinhVien(22222, "Le Thi Mai", 6.0f, 7.0f);

        SinhVien sv3 = new SinhVien();
        System.out.print("Nhập mã số của sinh viên sv3: ");
        sv3.setMssv(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập họ và tên của sinh viên sv3: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.print("Nhập điểm lý thuyết của sinh viên sv3: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.print("Nhập điểm thực hành của sinh viên sv3: ");
        sv3.setDiemTH(scanner.nextFloat());

        System.out.println("masv\thoten\t\tdiemlt\tdiemth\tdiemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
