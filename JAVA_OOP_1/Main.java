public class Main {
    public static void main(String[] args) {
        NhanVien staff = new NhanVien("Thong", 25, "STAFF0001");
        ThongTin info = new ThongTin(staff);

        info.printInfo();
    }
}