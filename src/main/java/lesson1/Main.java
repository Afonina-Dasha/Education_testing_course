package lesson1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        RandomValue nameRandomGenerator = new RandomValue("src/main/resources/FirstNames.txt");

        Set<Person> set = new HashSet<>();
        List<Person> personList = new ArrayList<>();
        IntStream.range(0,99).forEach(i -> {
            personList.add(new Person());
        });
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.age > o2.age){
                    return 1;
                }
                else if(o1.age < o2.age){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(new Person());
    }
}

