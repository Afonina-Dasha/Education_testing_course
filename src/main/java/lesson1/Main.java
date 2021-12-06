package lesson1;

import jdk.nashorn.internal.ir.Terminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();


        ClassWithExceptions withExceptions = new ClassWithExceptions();
        try {
            withExceptions.callExceptions(16);
        }
        catch (Exception_3 e){
            e.printStackTrace();
        }
        catch (Exception_2 e){
            e.printStackTrace();
        }
        catch (Exception_1 e){
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }





    }
}

