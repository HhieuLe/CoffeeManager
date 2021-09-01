package Model;

import Regex.Regix;

public class Menu {
    public static void Login() {
        System.out.println("Tên đăng nhập :");
        String username = Regix.enterName();

    }
    public static void printManagerChoice() {
        System.out.println("----- Quản lý -----");
        System.out.println("1. Quản lý Thực Đơn");
        System.out.println("2. Quản lý Nhân Viên ");
        System.out.println("3. Order");
        System.out.println("0. Đăng xuất ");
        System.out.println("--------------------------");
    }

    public static void printMenuManagement() {
        System.out.println("----- Quản lý Thực Đơn-----");
        System.out.println("1. Xem danh sách món");
        System.out.println("2. Thêm món mới");
        System.out.println("3. Sửa món ");
        System.out.println("4. Xóa món");
        System.out.println("0. Trở lại");

    }

    public static void printShowMenu() {
        System.out.println("----- Hiển thị danh sách món-----");
        System.out.println("1. Hiển thị tất cả");
        System.out.println("2. Hiển thị theo loại");
        System.out.println("0. Trở lại");
    }

    public static void printStaffManagement() {
        System.out.println("----- Quản Lý Nhân Viên -----");
        System.out.println("1. Xem danh sách nhân viên");
        System.out.println("2. Thêm nhân viên");
        System.out.println("3. Sửa thông tin nhân viên");
        System.out.println("4. Xóa nhân viên");
        System.out.println("5. Tìm kiếm nhân viên");
        System.out.println("0. Trở lại");
    }
    public static void editMenu(){
        System.out.println("Chọn phần cần sửa : ");
        System.out.println("1. Sửa tất cả");
        System.out.println("2. Sửa tên đồ uống");
        System.out.println("3. Sửa loại đồ uống");
        System.out.println("4. Sửa giá đồ uống");

    }
}
