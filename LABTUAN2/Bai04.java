import java.util.Scanner;

class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }

    @Override
    public String toString() {
        return tenChuXe + "\t" + loaiXe + "\t" + dungTich + "\t" + triGia + "\t" + tinhThue();
    }
}

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[3];

        for (int i = 0; i < vehicles.length; i++) {
            System.out.print("Tên chủ xe: ");
            scanner.nextLine();
            String tenChuXe = scanner.nextLine();
            System.out.print("Loại xe: ");
            String loaiXe = scanner.nextLine();
            System.out.print("Dung tích (cc): ");
            int dungTich = scanner.nextInt();
            System.out.print("Giá: ");
            double triGia = scanner.nextDouble();

            vehicles[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
        }

        System.out.println("Tên chủ xe\tLoại xe\tDung tích\tTrị giá\tThuế phải nộp");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
