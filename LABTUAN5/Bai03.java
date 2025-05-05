import java.util.Scanner;
abstract class PhuongTien {
    protected String maPT;
    protected String tenPT;
    protected String hangSX;
    protected int namSX;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phương tiện: ");
        maPT = sc.nextLine();
        System.out.print("Nhập tên phương tiện: ");
        tenPT = sc.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        hangSX = sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSX = sc.nextInt();
        sc.nextLine(); 
    }
    public void xuat() {
        System.out.println("Mã PT: " + maPT);
        System.out.println("Tên PT: " + tenPT);
        System.out.println("Hãng SX: " + hangSX);
        System.out.println("Năm SX: " + namSX);
    }

    public abstract double tinhGiaTri();
}

class XeTai extends PhuongTien {
    private double taiTrong;
    private double giaTri;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tải trọng (tấn): ");
        taiTrong = sc.nextDouble();
        System.out.print("Nhập giá trị xe: ");
        giaTri = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tải trọng: " + taiTrong + " tấn");
        System.out.println("Giá trị xe: " + giaTri);
        System.out.println("Thành tiền: " + tinhGiaTri());
    }

    @Override
    public double tinhGiaTri() {
        return giaTri;
    }
}

class XeKhach extends PhuongTien {
    private int soCho;
    private double giaVe;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số chỗ: ");
        soCho = sc.nextInt();
        System.out.print("Nhập giá vé: ");
        giaVe = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số chỗ: " + soCho);
        System.out.println("Giá vé: " + giaVe);
        System.out.println("Tổng doanh thu giả định: " + tinhGiaTri());
    }

    @Override
    public double tinhGiaTri() {
        return soCho * giaVe;
    }
}

public class Bai03 {
    public static void main(String[] args) {
        System.out.println("1. Nhập thông tin xe tải:");
        XeTai xeTai = new XeTai();
        xeTai.nhap();
        xeTai.xuat();

        System.out.println("\n2. Nhập thông tin xe khách:");
        XeKhach xeKhach = new XeKhach();
        xeKhach.nhap();
        xeKhach.xuat();
    }
}
