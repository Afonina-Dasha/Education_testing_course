package lesson1;

public class Woodpecker implements Bird, Flyable, Migratable { //дятлы


    @Override
    public void layEggs() {

    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public void migrate() {
        Migratable.super.migrate();
    }
}
