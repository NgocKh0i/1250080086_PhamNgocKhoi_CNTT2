import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int so = sc.nextInt();

        int tong = tinhTongChuSo(so);
        int tich = tinhTichChuSo(so);

        System.out.println("Tổng chữ số: " + tong);
        System.out.println("Tích chữ số: " + tich);

        sc.close();
    }

    static int tinhTongChuSo(int so) {
        int tong = 0;
        while (so > 0) {
            tong += so % 10;
            so /= 10;
        }
        return tong;
    }

    static int tinhTichChuSo(int so) {
        int tich = 1;
        while (so > 0) {
            tich *= so % 10;
            so /= 10;
        }
        return tich;
    }
}