import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int so = sc.nextInt();

        int csCuoi = layCsCuoi(so);
        int csDau = layCsDau(so);

        System.out.println("Chữ số đầu: " + csDau);
        System.out.println("Chữ số cuối: " + csCuoi);

        sc.close();
    }

    static int layCsCuoi(int so) {
        return so % 10;
    }

    static int layCsDau(int so) {
        while (so >= 10) {
            so /= 10;
        }
        return so;
    }
}