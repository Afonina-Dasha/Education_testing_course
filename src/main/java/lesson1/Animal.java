package lesson1;
import java.util.Random;
import java.util.UUID;

public abstract class Animal {
    protected int heft; //вес
    protected int age; //возраст
    UUID gen; //уникальный генетический код
    public void eat(Food food){
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
    private String gender_1;
    private void CalcGender(){
        Random random = new Random();
        int temp = random.nextInt();
        if (temp%2 ==0){
            gender_1 = "male";
        }
        else {
            gender_1 = "female";
        }
    }
    public String getGender_1() {
        return gender_1;
    }
    public Animal Reproduction(Animal rep){
        if(rep.gender_1 == this.gender_1 || rep.getClass() != this.getClass()){
            return null;
        }
        UUID child_gen = UUID.fromString(this.gen.toString() + rep.gen.toString());
        //new StringBuffer().append(gen).append(gen).toString(); - чтобы не занималась память
        return create_child(child_gen);
    }
    protected abstract Animal create_child(UUID child_gen);
}
