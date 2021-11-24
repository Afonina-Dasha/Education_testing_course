package lesson1;

public class Eagle implements Bird, Flyable, Migratable{ //орлы


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
