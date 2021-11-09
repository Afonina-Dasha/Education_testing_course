package lesson1;

import java.util.UUID;

public class Rabbit extends Herbivores{
    public Rabbit(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    public @Override String voice(){ //метод родителя описываем здесь
        return "kh-kh";
    }
    protected @Override Animal create_child(UUID child_gen){
        return new Rabbit(1, 0, child_gen);
    }
}
