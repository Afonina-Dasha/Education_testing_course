package lesson1;

import java.util.UUID;

public class Lion extends Animal{
    public Lion(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    public @Override String voice(){ //метод родителя описываем здесь
        return "Arr-rrr";
    }
    protected @Override Animal create_child(UUID child_gen){
        return new Lion(3, 0, child_gen);
    }
}
