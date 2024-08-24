public class ThongTin {
    NhanVien staff;

    public ThongTin(NhanVien staff) {
        this.staff = staff;
    }

    public void printInfo() {
        System.out.println("Name: " + staff.getName());
        System.out.println("Age: " + staff.getAge());
        System.out.println("Id: " + staff.getId());
    }
}
