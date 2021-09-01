package Service;

import Model.Drinks;
import Model.Order;
import Regex.Regix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderDetailManager {
    private  Order order = new Order();
    private List<Drinks> drinksList = new ArrayList<>();


    public void order() {
        System.out.println("Nhập vào id order");
        int idOrder = Regix.enterInteger();
        System.out.println("Nhập id bàn : ");
        int idTable = Regix.enterInteger();

        order.setOrderID(idOrder);
        order.setOrderID(idTable);

        System.out.println("Nhập id đồ uống : ");
        int idDrinks = Regix.enterInteger();
        System.out.println("Nhập vào số lượng đồ uống : ");
        int amount = Regix.enterInteger();

        Drinks drinks = null;
        for (Drinks d : DrinksManager.drinksList) {
            if (d.getIdDrinks() == idDrinks) {
                drinks = d;
                break;
            }
        }
        if (drinks==null){
            System.out.println("Đồ uống không tồn tại");
        }else{
            order.setIdDrinks(idDrinks);
            order.setAmount(amount);
            drinksList.add(drinks);
            order.setDrinksList(drinksList);
        }
    }
    public void showOrder(){
        int total=0;
        System.out.println("Table : "+order.getTabbleID()+"Id Order : "+order.getOrderID() );
        for(Drinks d : drinksList){
            System.out.println("Tên đồ uống : "+d.getName() + "Giá : "+d.getPrice()+"Số lượng :"+ order.getAmount());
            total+=(d.getPrice()* order.getAmount());
        }
        System.out.println(total);
    }
}
