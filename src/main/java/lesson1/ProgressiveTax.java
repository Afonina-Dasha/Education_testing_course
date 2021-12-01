package lesson1;

public class ProgressiveTax extends Service implements Taxable{

    //это не прогрессивный налог
    @Override
    public float calculate(float base) {
        return price = (float) (base * 0.15);
    }
}
