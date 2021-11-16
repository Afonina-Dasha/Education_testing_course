package lesson_cafe;

public class MenuParser { // parser - считыватель
    public static Dish parsedDrink(String menuNumber){
        switch (menuNumber){
            case "1":
                return new Drink("Кофе", 150);
            case "2":
                return new Drink("Газ. напиток", 100);
            case "3":
                return new Drink("Сок", 120);
            default:
                return null;
        }
    }
    public static Dish parsedFood(String menuNumber){
        switch (menuNumber){
            case "4":
                return new Food("Пицца", 500);
            case "5":
                return new Food("Бургер", 140);
            case "6":
                return new Food("Шаурма", 120);
            default:
                return null;
        }
    }
}
