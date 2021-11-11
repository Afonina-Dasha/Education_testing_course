package lesson1;

import java.util.UUID;

public abstract class Predator extends Animal{
    protected double weight;
    public void eat(Meat meat){
        super.eat(meat);
        if (CalcOfFoodEaten(food.weight)){
            heft = heft + heft / 25;
    }
    }
    public Predator(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    private boolean CalcOfFoodEaten(double weight){// подсчет съеденной еды
        if (weight < heft /2){
            return false;
        }
        return true;
    }


}
