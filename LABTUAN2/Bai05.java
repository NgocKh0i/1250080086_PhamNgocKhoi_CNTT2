import java.util.Scanner;

// a
class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}

// b
class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }

    @Override
    public String toString() {
        return "Book Code: " + boCode + ", Title: " + boTitle + ", Author: " + boAuthor;
    }
}

// c
class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {
        this.tenSp = "";
        this.donGia = 0.0;
        this.giamGia = 0.0;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}
public class ProjectAllInOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Test Student class
        Student st = new Student("12345", "Nguyen Van A", "CNTT");
        System.out.println(st);

        // b. Test Book class
        Book bk = new Book("B001", "Java Programming", "John Doe");
        System.out.println(bk);

        // c. Test SanPham class
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }
}
