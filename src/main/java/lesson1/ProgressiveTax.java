package lesson1;

public class ProgressiveTax implements Taxable{

    @Override
    public void calculate(float base) {

        float coefficient;
        if (base >= 0 && base < 18650){
            coefficient = 10;
        }
        else if(base >= 18650 && base < 75900) {
            coefficient = 15;
        }
        else  if (base >= 75900 && base < 153100){
            coefficient = 25;
        }
        else if (base >= 153100 && base < 233350){
            coefficient = 28;
        }
        else if(base >= 233350 && base < 416700){
            coefficient = 33;
        }
        else if (base >= 416700 && base < 470700){
            coefficient = 35;
        }
        else if (base >= 470700){
            coefficient = 39.6f;
        }
        else {
            coefficient = 0;
        }
        System.out.println("Прогрессивный налог = " + base * coefficient/100);
    }
}
