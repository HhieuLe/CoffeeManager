package Model;

import java.util.List;

public class Table {
    private int tableID;
    private int tableNumber;
    private boolean used = false;
    private Order order;

    public Table() {
    }

    public Table(int tableID, int tableNumber) {
        this.tableNumber = tableNumber;
        this.tableID = tableID;
    }

    public Table(int tableID, int tableNumber, Order order) {
        this.tableID = tableID;
        this.tableNumber = tableNumber;
        this.order = order;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
