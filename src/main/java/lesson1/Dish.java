package lesson1;

public abstract class Dish {
    public String name; //название блюда
    public double price; // цена
    public Dish(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

}
