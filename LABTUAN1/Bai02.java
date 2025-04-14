import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        double dienTich = rong * dai;
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        
        scanner.close();
    }

