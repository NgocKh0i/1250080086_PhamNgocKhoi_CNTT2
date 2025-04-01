import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int 1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int 2 = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int 3 = scanner.nextInt();
        
        int nhonhat = Math.min(1, Math.min(2, 3));
        System.out.println("Số nhỏ nhất là: " + nhonhat);
        
        scanner.close();
    }
}