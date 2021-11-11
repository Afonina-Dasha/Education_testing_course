package lesson1;

import java.util.UUID;

public abstract class Herbivores extends Animal {
    public Herbivores(int heft, int age, UUID gen) {
        super(heft, age, gen);
    }

    public void eat(Grass grass) {
        super.eat(grass);
        if (CalcOfFoodEaten(food.weight)){
            heft = heft + heft / 25;
        }
    }

    private boolean CalcOfFoodEaten(double weight) {// подсчет съеденной еды
        if (weight < heft * 2 / 3) {
            return false;
        }
        return true;
    }
}
