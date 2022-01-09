package lesson1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

public class Person implements Comparable<Person>{
    Integer age;
    String name;
    HashMap<String, String> fio;

    public Person() {
        age = new Random().nextInt(99);
        //fio = "123";

    }

    @Override
    public int compareTo(Person o) {
        return this.age;
    }
}
