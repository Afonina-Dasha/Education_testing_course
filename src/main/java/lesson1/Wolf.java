package lesson1;

import java.util.UUID;

public class Wolf extends Animal{
    public Wolf(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    public @Override String voice(){
        return "yyyyyy-yy-yy";
    }
    protected @Override Animal create_child(UUID child_gen){
        return new Wolf(3, 0, child_gen);
    }
}
