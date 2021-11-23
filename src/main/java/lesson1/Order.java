package lesson1;

import java.util.ArrayList;

public abstract class Order {
    ArrayList<Dish> orderBody = new ArrayList<>();
    float sum = 0;
    ArrayList<Food> orderItemName = new ArrayList<>();
    public abstract float calculate();


    public void addFood(Food dish){
        if(isItInOrder(dish)){
            sum += dish.getPrice() * 0.5;
            orderItemName.remove(dish.getName());
        }
        else {
            sum += dish.getPrice();
            orderItemName.add(dish);
        }
        orderBody.add(dish);
    }
    public void addDrink(Drink dish){
        sum += dish.getPrice();
        orderBody.add(dish);
    }
    protected boolean isItInOrder(Food food){
        for (Object name: orderItemName.toArray()) {
            if(name.equals(food.getName())){
                return true;
            }
        }
        return false;
    }
}
