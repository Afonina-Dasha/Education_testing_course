package lesson1;

public class NDS implements Taxable{

    @Override
    public void calculate(float base) {

        float price;
        price = (float) (base * 0.2);
        System.out.println("Налог НДС = " + price);
    }
}
