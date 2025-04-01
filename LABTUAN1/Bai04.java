import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();
        
        boolean laNamNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
        System.out.println(nam + (laNamNhuan ? " là năm nhuận" : " không phải năm nhuận"));
        
        scanner.close();
    }
}