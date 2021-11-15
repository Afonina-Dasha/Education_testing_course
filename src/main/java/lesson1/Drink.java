package lesson1;

public class Drink extends Dish{
    String[] drink = new String[]{"Кофе", "Газ. напиток", "Сок"};
    protected int[] drink_prices = new int[]{150, 100, 120};
    protected int drinkNumber = 0; //хранится значение номера напитка
    protected int drinkCount = 0; //количество напитка
    protected int currentPrice_drink = drink_prices[drinkNumber]; //по номеру находим цену продукта в массиве цен

}
