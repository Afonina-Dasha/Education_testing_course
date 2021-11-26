package lesson1;

public class ProgressiveTax extends Service implements Taxable{
    @Override
    public float calculate(float base) {
        return price = (float) (base * 0.15);
    }
}
