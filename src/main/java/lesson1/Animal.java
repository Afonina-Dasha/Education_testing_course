package lesson1;
import java.util.UUID;

public abstract class Animal {
    protected float heft; //вес
    protected int age; //возраст
    UUID gen; //уникальный генетический код
    Sound sound; // издаваемый звук
    RandomGender gender; //случайное распределение пола
    public void eat(){
    }
    public void walk(){
    }
    public Animal() {};
    public Animal(float heft, int age, UUID gen, RandomGender gender) {
        this.heft = heft;
        this.age = age;
        this.gen = gen;
        this.gender = gender;
    }
}
