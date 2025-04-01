import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào Họ và Tên: ");
        String hoVaTen = scanner.nextLine();
        
        String[] parts = hoVaTen.split(" ");
        String ho = parts[0];
        String ten = parts[parts.length - 1];
        String tenDem = "";
        
        for (int i = 1; i < parts.length - 1; i++) {
            tenDem += parts[i] + " ";
        }
        tenDem = tenDem.trim();
        
        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
        
        scanner.close();
    }
}