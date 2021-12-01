package lesson1;

public interface Taxable {

    //как смысл в этой дефолтной реализации? тут метод, должен быть абстрактным
    default float calculate(float base){
        return base;

    }
}
