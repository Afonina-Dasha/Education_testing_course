package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NDS nds = new NDS();
        NDFL ndfl = new NDFL();
        ProgressiveTax progressiveTax = new ProgressiveTax();

        List<Service> services = new ArrayList<>();
        services.add(nds);
        services.add(ndfl);
        services.add(progressiveTax);

        //зачем тут цикл? он три раза выводит один и тот же расчет
        for (Service ignored : services
             ) {
            float calcNds = nds.calculate(30000);
            float calcNdfl = ndfl.calculate(30000);
            float calcProgTax = progressiveTax.calculate(30000);
            System.out.println("Налог с суммы 30000: " +" Налог НДС= " + calcNds +" Налог НДФЛ = "
                               + calcNdfl + " Прогрессивный налог = " + calcProgTax);

        }
    }
}

