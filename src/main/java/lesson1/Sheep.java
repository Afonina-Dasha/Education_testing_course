package lesson1;

import java.util.UUID;

public class Sheep extends Animal{
    public Sheep(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    public @Override String voice(){
        return "be-bee-beee";
    }
    protected @Override Animal create_child(UUID child_gen){
        return new Sheep(5, 0, child_gen);
    }
}
