package lesson1;

public interface Bird extends LayEggsable {

    //тут уместен final static, потому что колличество крыльев всегда одно и тоже
    int wings = 2;

    void layEggs();

}
