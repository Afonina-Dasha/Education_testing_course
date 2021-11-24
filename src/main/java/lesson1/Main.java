package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ducks ducks = new Ducks();
        Penguins penguins = new Penguins();
        Eagles eagles = new Eagles();
        List<Swimmable> sea = new ArrayList<>();
        sea.add(ducks);
        sea.add( penguins);
        for (Swimmable bird:sea
             ) {
            bird.swim();
            bird.layEggs();
        }
        List<Bird> aviarium = new ArrayList<>();
        aviarium.add(ducks);
        aviarium.add(eagles);



    }
}

