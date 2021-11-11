package lesson1;

import java.util.UUID;

public abstract class Predator extends Animal{
    public void eat(Meat meat){
        super.eat(meat);
    }
    public Predator(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    @Override
    protected double getWeightCoef() {
        return 1/2;
    }
}
