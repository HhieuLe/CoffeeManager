package Main;

import Model.Drinks;
import Model.Staff;

import java.util.Scanner;

import Regex.Regix;
import Service.*;

import static Model.Menu.*;


public class Main {
    public static void main(String[] args) {
        DrinksManager drinkList = new DrinksManager();
        StaffManager staffList = new StaffManager();
        OrderDetailManager orderDetailManager = new OrderDetailManager();

        int choice, menuChoice, showMenuChoice, staffChoice, showEditMenu;
        do {
            printManagerChoice();
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = Regix.enterInteger();
            switch (choice) {
                case 1:
                    do {
                        printMenuManagement();
                        System.out.println("Nhập lựa chọn của bạn : ");
                        menuChoice = Regix.enterInteger();
                        switch (menuChoice) {
                            case 1:
                                do {
                                    printShowMenu();
                                    System.out.print("Nhập lựa chọn của bạn : ");
                                    showMenuChoice = Regix.enterInteger();
                                    switch (showMenuChoice) {
                                        case 1:
                                            drinkList.displayList();
                                            break;
                                        case 2:
                                            drinkList.displayByType();
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Vui lòng nhập lại <3");
                                    }
                                } while (showMenuChoice != 0);
                                break;
                            case 2:
                                drinkList.addDrinks();
                                break;
                            case 3:
                                do {
                                    editMenu();
                                    showEditMenu = Regix.enterInteger();
                                    switch (showEditMenu) {
                                        case 1:
                                            drinkList.displayList();
                                            drinkList.editDrinks();
                                            drinkList.displayList();
                                            break;
                                        case 2:
                                            drinkList.displayList();
                                            drinkList.editNameDrinks();
                                            drinkList.displayList();
                                            break;
                                        case 3:
                                            drinkList.displayList();
                                            drinkList.editTypeDrinks();
                                            drinkList.displayList();
                                            break;
                                        case 4:
                                            drinkList.displayList();
                                            drinkList.editPriceDrinks();
                                            drinkList.displayList();
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Vui lòng nhập từ 0 đến 4");

                                    }

                                }while (showEditMenu!=0);
                                break;
                            case 4:
                                drinkList.displayList();
                                drinkList.deleteDrinks();
                                System.out.println("Danh sách sau khi xóa");
                                drinkList.displayList();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Vui lòng nhập lại <3");
                        }
                    } while (menuChoice != 0);
                    break;
                case 2:
                    do {
                        printStaffManagement();
                        System.out.print("Nhập lựa chọn của bạn : ");
                        staffChoice = Regix.enterInteger();
                        switch (staffChoice) {
                            case 1 -> staffList.showList();
                            case 2 -> staffList.addStaff(new Staff());
                            case 3 -> {
                                staffList.showList();
                                staffList.editStaff();
                                System.out.println("---------- Danh sách sau khi sửa ----------");
                                staffList.showList();
                            }
                            case 4 -> {
                                staffList.showList();
                                staffList.deleteStaff();
                                System.out.println("---------- Danh sách sau khi xóa ---------");
                                staffList.showList();
                            }
                            case 5->{
                                staffList.findStaff();
                            }
                        }
                    } while (staffChoice != 0);
                    break;
                case 3:
                    orderDetailManager.order();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 0 đến 2");
            }
        } while (choice != 0);
    }

}
