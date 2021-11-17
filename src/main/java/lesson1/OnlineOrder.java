package lesson1;

public class OnlineOrder extends Order{

    @Override
    public float calculate() {
        return sum * 0.85f;
    }
}
