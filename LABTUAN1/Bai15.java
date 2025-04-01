import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào ngày (dd/MM/yyyy): ");
        String ngayNhap = scanner.nextLine();
        
        String[] parts = ngayNhap.split("/");
        String ngay = parts[0];
        String thang = parts[1];
        String nam = parts[2];
        
        System.out.println("Ngày: " + ngay);
        System.out.println("Tháng: " + thang);
        System.out.println("Năm: " + nam);
        
        scanner.close();
    }
}