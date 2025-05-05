import java.util.Scanner;

interface Hinh {
    double tinhDienTich();
    void nhap();
}

class HinhVuong implements Hinh {
    private double canh;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        canh = sc.nextDouble();
    }

    public double tinhDienTich() {
        return canh * canh;
    }
}

class HinhChuNhat implements Hinh {
    private double dai, rong;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextDouble();
    }

    public double tinhDienTich() {
        return dai * rong;
    }
}

class HinhTron implements Hinh {
    private double banKinh;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextDouble();
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hinh[] ds = new Hinh[3];

        for (int i = 0; i < ds.length; i++) {
            System.out.println("1. Hinh vuong 2. Hinh chu nhat 3. Hinh tron");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    break;
            }
            ds[i].nhap();
        }

        for (Hinh h : ds) {
            System.out.println("Dien tich: " + h.tinhDienTich());
        }
    }
}
