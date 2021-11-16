package lesson_cafe;

public abstract class Dish {
    public String name; //название блюда
    public double price; // цена
    public void Dish(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){ //метод получает данные name
        return name;
    }
    public double getPrice(){
        return price;
    }
}
