package lesson1;

import java.util.Random;
import java.util.UUID;

 public class Tiger extends Predator {

    public void Gen(){
        int gen1;
         gen = UUID.randomUUID();
    }

    public Tiger(int heft, int age, UUID gen){
        super(heft, age, gen);
    }
    public @Override String voice(){ //переопределение метода voice для Tiger
        return "rrrr";
    }
    protected @Override Animal create_child(UUID child_gen){
        return new Tiger(3, 0, child_gen);
    }
}
