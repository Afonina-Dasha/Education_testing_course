package lesson1;

public class NDFL extends Service implements Taxable{
    @Override
    public float calculate(float base) {
        return price = (float) (base * 0.13);
    }
}
