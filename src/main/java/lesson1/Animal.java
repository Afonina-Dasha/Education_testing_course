package lesson1;
import java.util.Random;
import java.util.UUID;

public abstract class Animal {
    protected double heft; //вес
    protected int age; //возраст
    private UUID gen; //уникальный генетический код
    public void eat(Food food){
    }
    Food food; // строчки 11-14 по аналогии с Engine
    public Animal(Food food){
        this.food = food;
    }
    public void walk(){
    }
    public abstract String voice();
    public Animal() {};
    public Animal(int heft, int age, UUID gen) {
        this.heft = heft;
        this.age = age;
        this.gen = gen;
        CalcGender();
    }
    private String gender;
    private void CalcGender(){
        Random random = new Random();
        int temp = random.nextInt();
        if (temp%2 ==0){
            gender = "male";
        }
        else {
            gender = "female";
        }
    }
    public String getGender_1() {
        return gender;
    }
    public Animal Reproduction(Animal rep){
        if(rep.gender == this.gender || rep.getClass() != this.getClass()){
            return null;
        }
        UUID child_gen = UUID.fromString(this.gen.toString() + rep.gen.toString());
        //new StringBuffer().append(gen).append(gen).toString(); - чтобы не занималась память
        return create_child(child_gen);
    }
    protected abstract Animal create_child(UUID child_gen);
}
