import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();
        
        boolean checkTamGiac = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println(checkTamGiac ? "Tam giác hợp lệ" : "Tam giác không hợp lệ");
        
        scanner.close();
    }
}