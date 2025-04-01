public class Bai12 {
    public static boolean kiemTraDoiXung(int so) {
        int soDaoNguoc = daoNguocSo(so);
        return soDaoNguoc == so;
    }

    private static int daoNguocSo(int so) {
        int ketQua = 0;
        while (so > 0) {
            ketQua = ketQua * 10 + so % 10;
            so /= 10;
        }
        return ketQua;
    }
}