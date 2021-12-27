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

    /*public boolean isDigit(int num) throws IllegalArgumentException{ //проверка строки на число
        try
        {
            double d = Integer.parseInt(String.valueOf(num));
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }*/
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
