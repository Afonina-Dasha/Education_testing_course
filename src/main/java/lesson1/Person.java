package lesson1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.IntStream;

public class Person implements Comparable<Person>{
    Integer age;
    String name;
    HashMap<String, String> fio;

    RandomValue nameRandomGenerator = new RandomValue("src/main/resources/FirstNames.txt");

    public Person() {
        age = new Random().nextInt(99);
        IntStream.range(0, 100).forEach(i -> {
        name = nameRandomGenerator.getRandom();
        });
    }

    @Override
    public int compareTo(Person o) {
        return this.age;
    }
}
