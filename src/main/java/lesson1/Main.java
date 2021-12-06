package lesson1;

import jdk.nashorn.internal.ir.Terminal;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        /*Scanner s = in.readLine()
        number = Integer.parseInt(in.readLine());*/


        ClassWithExceptions withExceptions = new ClassWithExceptions();
        try {
            withExceptions.callExceptions(0);
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
        finally {
            System.out.println("Произведение числа на самого себя: " + number * number);
        }





    }
}

