package lesson1;

import java.util.UUID;

public abstract class Herbivores extends Animal {
    public Herbivores(int heft, int age, UUID gen) {
        super(heft, age, gen);
    }
    public void eat(Grass grass) {
        super.eat(grass);
        }
    @Override
    protected double getWeightCoef() {
        return (((double) 2)/3);
    }
}
