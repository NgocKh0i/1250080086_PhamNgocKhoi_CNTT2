import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int so = sc.nextInt();

        int soChuSo = tinhSoChuSo(so);
        System.out.println("Số chữ số: " + soChuSo);

        sc.close();
    }

    static int tinhSoChuSo(int so) {
        return String.valueOf(so).length();
    }
}