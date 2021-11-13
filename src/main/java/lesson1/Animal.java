package lesson1;
import java.util.Random;
import java.util.UUID;

public abstract class Animal {
    //лишние строки плохо, отсуствие отбивок тоже плохо. методы и блок полей строками.
    protected double heft; //вес
    protected int age; //возраст
    private UUID gen; //уникальный генетический код

    public void eat(Food food) {
        //получение веса еды нужно получать через геттер
        if (CalcOfFoodEaten(food.weight)) {
            heft = heft + heft / 25;
        }
    }

    //зачем метод с пустым телом? 
    public void walk() {
    }

    public abstract String voice();

    //этот конструктор по идеи противоречит спецификации
    //какой вес и возраст у новорожденного?
    public Animal(int heft, int age, UUID gen) {
        this.heft = heft;
        this.age = age;
        this.gen = gen;
        CalcGender();
    }
    //почему это поле тут? все поля объявляются в начале класса.
    private String gender;

    //название методов пишутся с маленькой буквы, кроме конструктора
    private void CalcGender() {
        Random random = new Random();
        int temp = random.nextInt();
        if (temp % 2 == 0) {
            gender = "male";
        } else {
            gender = "female";
        }
    }

    public String getGender_1() {
        return gender;
    }

    //зачем нужен этот метод?
    public Animal Reproduction(Animal rep) {
        if (rep.gender == this.gender || rep.getClass() != this.getClass()) {
            return null;
        }
        UUID child_gen = UUID.fromString(this.gen.toString() + rep.gen.toString());
        //new StringBuffer().append(gen).append(gen).toString(); - чтобы не занималась память
        return create_child(child_gen);
    }

    protected abstract Animal create_child(UUID child_gen);

    //смерть и жизнь - это состояние, которое должно хранится. такая реализация меня не устраивает!
    private boolean CalcOfFoodEaten(double weight) {// подсчет съеденной еды
        if (weight < heft * getWeightCoef()) {
            System.out.println("Животное умирает");
            return false;
        }
        System.out.println("Животное живет");
        return true;

    }

    protected abstract double getWeightCoef();
}
