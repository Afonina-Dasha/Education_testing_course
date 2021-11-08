package lesson1;

import java.util.Random;
import java.util.UUID;

public abstract class Tiger extends Animal {
    public void Gen(){
        int gen1;
         gen = UUID.randomUUID();
    }

    public Tiger(int heft, int age, UUID gen, RandomGender gender){
        super(heft, age, gen, gender);
    }


}
