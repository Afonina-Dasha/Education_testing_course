package lesson1;

import java.util.ArrayList;

public abstract class Order { //Заказ
    ArrayList<Dish> orderBody = new ArrayList<>(); // тело заказа
    //ArrayList это саморасширяющийся массив, внутри храним Dish(и Food и Drink)
    float sum = 0;
    ArrayList<Food> orderItemName = new ArrayList<>(); // массив маркер
    public abstract float calculate(); // метод подсчитывает сумму, сумма из тела заказа orderBody


    public void addFood(Food dish){ //при каждом добавлении еды проверяем, он есть в заказе?
        if(isItInOrder(dish)){
            sum += dish.getPrice() * 0.5; // если да, зашли сюда
            //orderItemName.remove(dish.getName()); // удалили
        }
        else {
            sum += dish.getPrice();
            orderItemName.add(dish);// если нет, до добавили в наш массив маркер
        }
        orderBody.add(dish);
    }
    public void addDrink(Drink dish){ //складываем в заказ drink-и
        sum += dish.getPrice();
        orderBody.add(dish);
    }
    protected boolean isItInOrder(Food food){ //
        for (Object name: orderItemName.toArray()) {
            if(name.equals(food.getName())){ // здесь есть бургер
                return true;
            }
        }
        return false; // если не нашли бургер, то говорим что нет такой еды
    }
}
