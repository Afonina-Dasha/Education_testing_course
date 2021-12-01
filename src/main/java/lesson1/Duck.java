package lesson1;

public class Duck implements Bird, Flyable, Migratable, Swimmable {
    @Override
    public void layEggs() {

    }

    //зачем тут вызывается метод из интерфейсов? При переопределении пишется своя реализация
    @Override
    public void fly() {
        Flyable.super.fly();
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
