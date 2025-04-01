import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double hoa = scanner.nextDouble();
        System.out.print("Nhập điểm Sinh: ");
        double sinh = scanner.nextDouble();
        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();
        System.out.print("Nhập điểm Máy tính: ");
        double mayTinh = scanner.nextDouble();
        
        double tb = (ly + hoa + sinh + toan + mayTinh) / 5;
        String hang = tb >= 90 ? "A" :
                      tb >= 80 ? "B" :
                      tb >= 70 ? "C" :
                      tb >= 60 ? "D" :
                      tb >= 40 ? "E" : "F";
        
        System.out.println("Xếp loại: Hạng " + hang);
        
        scanner.close();
    }
}