package lesson1;

public class Food extends Dish {
    String[] food = new String[]{"Пицца", "Бургер", "Шаурма"};
    protected int[] food_prices = new int[]{500, 140, 120};
    /*int[] list = {}*/
    protected int foodNumber = 0;
    protected int foodCount = 0;
    protected int currentPrice_food = food_prices[foodNumber];
}
