import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = scanner.nextLine();
        
        int soTu = demSoTu(chuoi);
        System.out.println("Số từ trong chuỗi: " + soTu);
        
        scanner.close();
    }

    static int demSoTu(String chuoi) {
        if (chuoi == null || chuoi.trim().isEmpty()) {
            return 0;
        }
        String[] tu = chuoi.trim().split("\\s+");
        return tu.length;
    }
}