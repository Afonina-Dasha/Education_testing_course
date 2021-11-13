package lesson1;

import java.util.UUID;

public abstract class Predator extends Animal{


    public Predator(int heft, int age, UUID gen) {
        super(heft, age, gen);
    }

    public void eat(Meat meat){
        super.eat(meat);
    }

    @Override
    protected double getWeightCoef() {
        return((double) 1)/2;
    }
}
