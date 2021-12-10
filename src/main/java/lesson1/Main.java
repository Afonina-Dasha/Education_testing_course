package lesson1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        RandomValue secondRandomGenerator = new RandomValue("src/main/resources/SecondNames.txt");
        RandomValue nameRandomGenerator = new RandomValue("src/main/resources/FirstNames.txt");
        RandomValue otchestvoRandomGenerator = new RandomValue("src/main/resources/FirstNames.txt");

        List<FIO> fioList = new ArrayList<>();


        IntStream.range(0, 100).forEach(i->{
            String second = secondRandomGenerator.getRandom();
            String name = nameRandomGenerator.getRandom();
            String otchestvo = otchestvoRandomGenerator.getRandom();
            FIO fio = new FIO(second, name, otchestvo);
            fioList.add(fio);
        });


    }
}

