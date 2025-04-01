import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int so = sc.nextInt();

        int soDaoNguoc = daoNguocSo(so);
        System.out.println("Số đảo ngược: " + soDaoNguoc);

        sc.close();
    }

    static int daoNguocSo(int so) {
        int ketQua = 0;
        while (so > 0) {
            ketQua = ketQua * 10 + so % 10;
            so /= 10;
        }
        return ketQua;
    }
}