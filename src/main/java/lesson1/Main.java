package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck(); // утка
        Penguin penguin = new Penguin(); // пингвин
        Eagle eagle = new Eagle(); //орел
        Chicken chicken = new Chicken(); // курица
        Ostriche ostriche = new Ostriche(); // страус
        Titmouse titmouse = new Titmouse(); // синица
        Woodpecker woodpecker = new Woodpecker(); // дятел

        List<Swimmable> sea = new ArrayList<>();
        sea.add(duck);
        sea.add(penguin);
        for (Swimmable bird:sea
             ) {
            bird.swim();
            bird.layEggs();
        }

        List<Flyable> sky = new ArrayList<>();
        sky.add(duck);
        sky.add(eagle);
        for (Flyable bird:sky
             ) {
            bird.fly();
        }

        List<Migratable> migraty = new ArrayList<>();
        migraty.add(duck);
        migraty.add(eagle);
        migraty.add(titmouse);
        migraty.add(woodpecker);
        for (Migratable bird:migraty
             ) {
            bird.migrate();
        }



    }
}

