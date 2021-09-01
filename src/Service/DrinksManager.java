package Service;

import Model.Drinks;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Regex.Regix;
import WriteReadFile.WriteReadDrinks;

public class DrinksManager {
   public static List<Drinks> drinksList;

    public void addDrinks() {
        drinksList = WriteReadDrinks.readFile();
        System.out.println("Nhập thông tin thức uống : ");

        int id = drinksList.size() + 1;
        System.out.print("Nhập loại đồ uống : ");
        String type = Regix.enterName();
        System.out.print("Nhập tên đồ uống : ");
        String name = Regix.enterName();
        System.out.print("Nhập giá đồ uống :");
        int price = Regix.enterInteger();
        System.out.println("Thêm mới thành công");

        Drinks drink = new Drinks(id, type, name, price);
        drinksList.add(drink);
        WriteReadDrinks.writeFile(drinksList);

    }


    public void displayList() {
        drinksList = WriteReadDrinks.readFile();
        System.out.printf("| %-5s | %-20s | %-15s | %-15s%n", "ID", "Tên", "Loại", "Giá");
        for (Drinks drinks : drinksList) {
            drinks.displayDrinks();
        }
    }


    public void displayByType() {
        drinksList = WriteReadDrinks.readFile();
        System.out.print("Nhận loại thức uống cần tìm kiếm : ");
        String nameType = new Scanner(System.in).nextLine();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Loại : " + nameType);
        System.out.printf("| %-5s | %-20s | %-15s%n", "ID", "Tên", "Giá");
        for (Drinks drinks : drinksList) {
            if (drinks.getType().equals(nameType)) {
                drinks.displayTypeDrinks();
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public void editDrinks() {
        drinksList = WriteReadDrinks.readFile();
        System.out.print("Nhập ID món cần sửa : ");
        int editID = Regix.enterInteger();
        for (Drinks drinks : drinksList) {
            if (drinks.getIdDrinks() == (editID)) {
                System.out.print("Loại đồ uống : ");
                drinks.setType(Regix.enterName().trim());
                System.out.print("Tên đồ uống : ");
                drinks.setName(Regix.enterName().trim());
                System.out.print("Giá đồ uống :");
                drinks.setPrice(Regix.enterInteger());

                WriteReadDrinks.writeFile(drinksList);
            }
        }
    }

    public void editNameDrinks() {
        drinksList = WriteReadDrinks.readFile();
        System.out.print("Nhập ID món cần sửa : ");
        int editID = Regix.enterInteger();
        for (Drinks drinks : drinksList) {
            if (drinks.getIdDrinks() == (editID)) {
                System.out.print("Loại đồ uống : ");
                drinks.setType(Regix.enterName().trim());
            }
        }
    }
    public void editPriceDrinks(){
        drinksList = WriteReadDrinks.readFile();
        System.out.print("Nhập ID món cần sửa : ");
        int editID = Regix.enterInteger();
        for (Drinks drinks : drinksList) {
            if (drinks.getIdDrinks() == (editID)) {
                System.out.print("Giá đồ uống :");
                drinks.setPrice(Regix.enterInteger());
            }
        }
    }
    public void editTypeDrinks(){
        drinksList = WriteReadDrinks.readFile();
        System.out.print("Nhập ID món cần sửa : ");
        int editID = Regix.enterInteger();
        for (Drinks drinks : drinksList) {
            if (drinks.getIdDrinks() == (editID)) {
                System.out.print("Tên đồ uống : ");
                drinks.setName(Regix.enterName().trim());
            }
        }
    }

    public void deleteDrinks() {
        drinksList = WriteReadDrinks.readFile();
        System.out.print("Nhập ID món cần xóa : ");
        int deleteID = Regix.enterInteger();
        for (Drinks drinks : drinksList) {
            if (drinks.getIdDrinks() == deleteID) {
                drinksList.remove(drinks);
                System.out.println("Xóa món thành công");
                break;
            }
        }
        WriteReadDrinks.writeFile(drinksList);
    }

}

