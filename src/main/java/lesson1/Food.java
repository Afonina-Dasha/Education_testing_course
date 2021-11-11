package lesson1;

import java.util.UUID;

public abstract class Food{
    protected int weight; //вес еды
    protected void CalcWeight(Animal animal){
    }
    Food meat = new Meat();
    Food grass = new Grass();

}
