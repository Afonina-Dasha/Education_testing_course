package lesson1;

public class Food extends Dish {
    String[] food = new String[]{"Пицца", "Бургер", "Шаурма"};
    int[] food_prices = new int[]{500, 140, 120};
    int foodNumber = 0;
    int foodCount = 0;
    int currentPrice_food = food_prices[foodNumber];
}
