package lesson1;

import java.util.UUID;

public class Cow extends Herbivores{

    public Cow(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    public @Override String voice(){
        return "myyyyy";
    }
    protected @Override Cow create_child(UUID child_gen) {
        return new Cow(10, 0, child_gen);
    }
}
