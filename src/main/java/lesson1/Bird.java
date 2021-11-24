package lesson1;

public interface Bird extends LayEggsable {

    static final int wings = 2;
    public default void layEggs(){ //сносить яйца
    }

}
