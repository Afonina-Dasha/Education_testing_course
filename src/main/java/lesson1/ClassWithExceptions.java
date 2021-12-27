package lesson1;

public class ClassWithExceptions{


    public boolean callExceptions(int num) throws Exception {


        if(num == 0){
            throw new Exception_3();
        }
        else if(num % 10 == 0){
            throw new Exception_2();
        }
        else if(num % 2 == 0){
            throw new Exception_1();
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
