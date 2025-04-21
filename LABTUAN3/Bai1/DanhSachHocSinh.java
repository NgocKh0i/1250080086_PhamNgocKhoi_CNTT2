import java.util.*;

public class DanhSachHocSinh {
    private ArrayList<HocSinh> ds = new ArrayList<>();

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập học sinh thứ " + (i + 1) + ":");
            HocSinh hs = new HocSinh();
            hs.nhapHocSinh();
            ds.add(hs);
        }
    }

    public void inDanhSach() {
        System.out.println("\nDanh sách học sinh:");
        for (HocSinh hs : ds) {
            hs.xuatHocSinh();
        }
    }

    public void sapXepGiamTheoDiem() {
        Collections.sort(ds, new Comparator<HocSinh>() {
            public int compare(HocSinh o1, HocSinh o2) {
                return Double.compare(o2.getDiemTrungBinh(), o1.getDiemTrungBinh());
            }
        });
    }

    public void doiTenHocSinh(String tenCu, String tenMoi) {
        for (HocSinh hs : ds) {
            if (hs.getHoTen().equalsIgnoreCase(tenCu)) {
                hs.setHoTen(tenMoi);
                System.out.println("Đã đổi tên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh tên: " + tenCu);
    }

    public HocSinh timDiemCaoNhat() {
        if (ds.isEmpty()) return null;

        HocSinh max = ds.get(0);
        for (HocSinh hs : ds) {
            if (hs.getDiemTrungBinh() > max.getDiemTrungBinh()) {
                max = hs;
            }
        }
        return max;
    }

    public ArrayList<HocSinh> getDanhSach() {
        return ds;
    }
}
