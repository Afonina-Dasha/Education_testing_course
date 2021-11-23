package lesson1;

public class OfflineOrder extends Order{

    int drinkCount = 0;
    @Override
    public float calculate() {
        return sum;
    }

    @Override
    public void addDrink(Drink dish) {
        drinkCount++;
        orderBody.add(dish);
        if(drinkCount % 2 == 0){
            sum += dish.getPrice() * 0.5;
        }
        else {
            sum += dish.getPrice();
        }
    }
}
