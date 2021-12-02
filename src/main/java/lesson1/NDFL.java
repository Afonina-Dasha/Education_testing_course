package lesson1;

public class NDFL implements Taxable{

    @Override
    public void calculate(float base) {

        float price;
        price = (float) (base * 0.13);
        System.out.println("Налог НДФЛ = " + price);
    }
}
