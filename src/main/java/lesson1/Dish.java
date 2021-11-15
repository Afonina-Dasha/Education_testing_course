package lesson1;
import java.util.ArrayList;

public class Dish { //Блюдо
    private String name; //название блюда
    private double price; // цена
    public void Dish(final String name, final double price){
        this.setName(name);
        this.setPrice(price);
    }
    public void setName(final String name){
        this.name =name;
    }
    public String getName(){ //метод получает данные name
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(final double price) {
        this.price = price;
    }
    public void printDet(){
        System.out.println(this.getName() + " : " + this.getPrice());
    }
    public String toString(){ // выводит имя класса объекта (преобразует и возвращает строку
        return name + "-" + price;
    }

}
