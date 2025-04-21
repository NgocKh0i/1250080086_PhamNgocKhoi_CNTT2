public class Demo2 {
    public static void main(String[] args) {
        DanhSachHocSinh ds = new DanhSachHocSinh();

        ds.nhapDanhSach();
        ds.inDanhSach();

        ds.doiTenHocSinh("Nguyen Van A", "Nguyen Van Z");

        HocSinh hsMax = ds.timDiemCaoNhat();
        System.out.println("\nHọc sinh có điểm trung bình cao nhất:");
        hsMax.xuatHocSinh();

        ds.sapXepGiamTheoDiem();
        System.out.println("\nDanh sách sau khi sắp xếp giảm dần theo điểm:");
        ds.inDanhSach();
    }
}
