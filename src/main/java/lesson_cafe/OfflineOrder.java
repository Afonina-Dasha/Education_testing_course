package lesson_cafe;

public class OfflineOrder extends Order{

    @Override
    public float calculate() {
        float totalSum = 0;
        for (Dish item:orderBody){
            totalSum += item.getPrice();
        }
        return totalSum;
    }
}
