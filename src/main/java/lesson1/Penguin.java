package lesson1;

public class Penguin implements Bird, Migratable, Swimmable {

    @Override
    public void layEggs() {

    }

    @Override
    public void migrate() {
        Migratable.super.migrate();
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
