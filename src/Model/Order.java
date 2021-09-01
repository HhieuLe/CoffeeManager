package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderID;
    private int tabbleID;
    private int totalPrice;
    private int idDrinks;
    private int amount;
    private List<Drinks> drinksList= new ArrayList<>();

    public Order() {


    }

    public int getIdDrinks() {
        return idDrinks;
    }

    public void setIdDrinks(int idDrinks) {
        this.idDrinks = idDrinks;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getTabbleID() {
        return tabbleID;
    }

    public void setTabbleID(int tabbleID) {
        this.tabbleID = tabbleID;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }
}
