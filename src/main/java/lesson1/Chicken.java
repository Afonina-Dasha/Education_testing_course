package lesson1;

public class Chicken implements Bird {
    @Override
    public void layEggs() {
        Bird.super.layEggs();
    }
}
