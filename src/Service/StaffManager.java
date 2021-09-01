package Service;

import Model.Staff;
import Regex.Regix;
import WriteReadFile.WriteReadStaff;

import java.util.List;
import java.util.Scanner;

public class StaffManager {
    List<Staff> staffList;

    public void addStaff(Staff staff) {
        staffList = WriteReadStaff.readFile();
        staff.setId(autoSetID());
        System.out.print("Nhập tên nhân viên (Vd: Nguyễn Văn A):  ");
        staff.setName(Regix.enterName());
        System.out.print("Nhập ngày thánh năm sinh (dd/mm/yyyy): ");

        staff.setDayOfBirth(Regix.checkDateTime());
        System.out.print("Nhập vị trí nhân viên (Vd: Phục vụ...): ");
        staff.setWorkingPosition(Regix.enterName());

        staffList.add(staff);
        WriteReadStaff.writeFile(staffList);
    }

    public void showList() {
        staffList = WriteReadStaff.readFile();
        System.out.printf("| %-5s | %-20s | %-15s | %-15s%n", "Id", "Tên", "Ngày sinh ", "Vị trí");
        for (Staff staff : staffList) {
            staff.showInfo();
        }
    }

    public void deleteStaff() {
        staffList = WriteReadStaff.readFile();
        System.out.print("Nhập ID cần xóa : ");
        int deleteID = Regix.enterInteger();
        for (Staff staff : staffList) {
            if (staff.getId() == deleteID) {
                System.out.println("Xóa nhân viên " + staff.getName() + " khỏi hệ thống ");
                System.out.print("->Nhập y/n : ");
                String string = new Scanner(System.in).nextLine();
                int confirm = string.toCharArray()[0];
                switch (confirm) {
                    case 121:
                        staffList.remove(staff);
                        System.out.println("Xóa thành công nhân viên" + staff.getName());
                        break;
                    case 110:
                        break;
                }
                break;
            }
        }
    }

    public int autoSetID() {

        if (staffList.size() == 0) {
            return 1001;
        } else {
            int last = staffList.get(staffList.size() - 1).getId();
            return last + 1;
        }
    }

    public void editStaff() {
        staffList = WriteReadStaff.readFile();
        System.out.print("Nhập ID cần sửa : ");
        int editID = Regix.enterInteger();
        for (Staff staff : staffList) {
            if (staff.getId() == editID) {
                System.out.print("Nhập mới tên : ");
                staff.setName(Regix.enterName().trim());
                System.out.print("Nhập mới ngày sinh : ");
                staff.setDayOfBirth(Regix.checkDateTime());
                System.out.print("Nhập mới vị trí : ");
                staff.setWorkingPosition(Regix.enterName().trim());

                WriteReadStaff.writeFile(staffList);
            }
        }
    }

    public void editNameStaff() {
        staffList = WriteReadStaff.readFile();
        System.out.print("Nhập ID cần sửa : ");
        int editID = Regix.enterInteger();
        for (Staff staff : staffList) {
            if (staff.getId() == editID) {
                System.out.print("Nhập mới tên : ");
                staff.setName(Regix.enterName().trim());
            }
        }
    }

    public void editDayOfBirth() {
        staffList = WriteReadStaff.readFile();
        System.out.print("Nhập ID cần sửa : ");
        int editID = Regix.enterInteger();
        for (Staff staff : staffList) {
            if (staff.getId() == editID) {
                System.out.print("Nhập mới ngày sinh : ");
                staff.setDayOfBirth(Regix.checkDateTime());
            }
        }
    }
    public void editWorkingPosition(){
        staffList = WriteReadStaff.readFile();
        System.out.print("Nhập ID cần sửa : ");
        int editID = Regix.enterInteger();
        for (Staff staff : staffList) {
            if (staff.getId() == editID) {
                System.out.print("Nhập mới vị trí : ");
                staff.setWorkingPosition(Regix.enterName().trim());
            }
        }
    }
}
