package lesson1;

public class Dish {
    public String name;
    public int price;
    public void dish(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){// возвращает имя объекта (метод получает данные name)
        return name;
    }
    public int getPrice(){ //
        return price;
    }
    public String toString(){ // выводит имя класса объекта (преобразует и возвращает строку
        return name + "-" + price;
    }

}
