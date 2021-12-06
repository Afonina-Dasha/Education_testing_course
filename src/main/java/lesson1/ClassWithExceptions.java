package lesson1;

import java.util.Scanner;

public class ClassWithExceptions{


    public void callExceptions(int num) throws Exception {

        if(num == 0){
            throw new Exception_3();
        }
        else if(num % 10 == 0){
            throw new Exception_2();
        }
        else if(num % 2 == 0){
            throw new Exception_1();
        }
    }

    public boolean isDigit(String num) throws IllegalArgumentException{ //проверка строки на число
        try{
            Integer.parseInt(num);
            return true;
        }
        catch (IllegalArgumentException e){
            return false;
        }
    }
}
