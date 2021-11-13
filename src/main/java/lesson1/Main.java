package lesson1;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {



    Animal tiger = new Tiger(300, 5, UUID.randomUUID()); //Tiger является наследником Animal, этим достигается абстракция
        tiger.age = 10;
    Animal lion = new Lion(350, 4, UUID.randomUUID());
    Animal wolf = new Wolf(200, 3, UUID.randomUUID());
    Animal sheep = new Sheep(150, 3, UUID.randomUUID());
    Animal cow = new Cow(1000, 6, UUID.randomUUID());
    Animal rabbit = new Rabbit(2, 0, UUID.randomUUID());
    System.out.println(tiger.getGender_1());

    Meat meat = new Meat();
    meat.setWeight(200);
    System.out.println(tiger.heft);
    tiger.eat(meat);
    System.out.println(tiger.heft);
    }
}

