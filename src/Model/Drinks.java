package Model;

public class Drinks {
    private int drinksID;
    private String name;
    private int price;
    private String type;


    public Drinks() {
    }

    public Drinks(int idDrinks, String type, String name, int price) {
        this.drinksID = idDrinks;
        this.name = name;
        this.price = price;
        this.type = type;

    }

    public int getIdDrinks() {
        return drinksID;
    }

    public void setIdDrinks(int idd) {
        this.drinksID = idd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void displayDrinks() {
        System.out.printf("  %-5s", getIdDrinks());
        System.out.format("   %-20s", getName());
        System.out.printf("   %-15s", getType());
        System.out.printf("   %-15d%n", getPrice());

    }

    public void displayTypeDrinks() {
        System.out.printf("  %-5s", getIdDrinks());
        System.out.format("  %-20s", getName());
        System.out.printf("  %-15d%n", getPrice());
    }


}


