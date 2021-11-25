package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner answer = new Scanner(System.in);
        System.out.println("Введите сумму для расчета налога: ");
        float number = answer.nextFloat();*/


        NDS nds = new NDS();
        NDFL ndfl = new NDFL();
        ProgressiveTax progressiveTax = new ProgressiveTax();


        /*List<Service> services = new ArrayList<>();
        services.add(nds);
        services.add(ndfl);
        services.add(progressiveTax);
        for (Service calc: services
             ) {
            calc.calculate(30000);
        }
        System.out.println(services +);*/
        ndfl.calculate(50000);
        nds.calculate(50000);
        progressiveTax.calculate(50000);

    }
}

