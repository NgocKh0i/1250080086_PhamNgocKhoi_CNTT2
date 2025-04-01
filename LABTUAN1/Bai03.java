import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập nhiệt độ F: ");
        double f = scanner.nextDouble();
        
        double c = (f - 32) / 1.8;
        System.out.println("Nhiệt độ C:" + c);
        
        scanner.close();
    }
}