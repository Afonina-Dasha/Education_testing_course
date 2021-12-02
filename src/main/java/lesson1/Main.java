package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("Введите сумму для подсчета налога: ");
        Scanner scanner = new Scanner(System.in);
        float answer = scanner.nextFloat();*/

        NDS nds = new NDS();
        NDFL ndfl = new NDFL();
        ProgressiveTax progressiveTax = new ProgressiveTax();

            nds.calculate(30000);
            ndfl.calculate(30000);
            progressiveTax.calculate(30000);

    }
}

