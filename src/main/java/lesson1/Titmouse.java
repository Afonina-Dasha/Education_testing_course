package lesson1;

public class Titmouse implements Bird, Flyable, Migratable { //синица

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
