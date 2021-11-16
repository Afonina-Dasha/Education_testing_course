package lesson_cafe;

import java.util.ArrayList;

public abstract class Order { //Заказ
    ArrayList<Dish> orderBody = new ArrayList<>(); // тело заказа
    //ArrayList это саморасширяющийся массив, внутри храним Dish(и Food и Drink)
    public abstract float calculate(); // метод подсчитывает сумму, сумма из тела заказа orderBody

    public void addItem(Dish dish){ //складываем в заказ пункты меню, которые мы заказали
        orderBody.add(dish);
    }
}
