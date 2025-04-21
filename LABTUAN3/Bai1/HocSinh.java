public class HocSinh {
    private String maSo;
    private String hoTen;
    private double diemTrungBinh;

    public HocSinh() {}

    public HocSinh(String maSo, String hoTen, double diemTrungBinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhapHocSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        maSo = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = Double.parseDouble(sc.nextLine());
    }

    public void xuatHocSinh() {
        System.out.println("Mã số: " + maSo + " | Họ tên: " + hoTen + " | Điểm TB: " + diemTrungBinh);
    }
}
