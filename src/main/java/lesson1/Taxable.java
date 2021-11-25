package lesson1;

public interface Taxable {

    default float calculate(float base){
        return base;
    }
}
