package lesson1;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Random;

public class RandomGender extends Animal{
    public boolean getRandomGender(){ // случайное распределение пола
        Random gender = new Random();
        return gender.nextBoolean();
    }

}
