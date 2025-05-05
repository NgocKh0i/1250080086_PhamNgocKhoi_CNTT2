import java.util.Scanner;

abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        maNhanVien = sc.nextLine();
        System.out.print("Ten nhan vien: ");
        tenNhanVien = sc.nextLine();
        System.out.print("Trinh do: ");
        trinhDo = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCoBan = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Ma: " + maNhanVien);
        System.out.println("Ten: " + tenNhanVien);
        System.out.println("Trinh do: " + trinhDo);
        System.out.println("Luong co ban: " + luongCoBan);
    }

    public abstract double tinhLuong();
}

class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapChucVu;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.print("Phu cap chuc vu: ");
        phuCapChucVu = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap chuc vu: " + phuCapChucVu);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapChucVu;
    }
}

class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.print("Phu cap doc hai: ");
        phuCapDocHai = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap doc hai: " + phuCapDocHai);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
}

class PhucVu extends NhanVien {
    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}

public class Bai01 {
    public static void main(String[] args) {
        NhanVien[] ds = new NhanVien[3];
        ds[0] = new QuanLy();
        ds[1] = new NghienCuu();
        ds[2] = new PhucVu();

        for (NhanVien nv : ds) {
            nv.nhap();
        }

        for (NhanVien nv : ds) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
            System.out.println("---");
        }
    }
}
