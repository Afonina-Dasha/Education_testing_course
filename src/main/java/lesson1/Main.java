package lesson1;

import jdk.nashorn.internal.ir.Terminal;

import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
            try {
                int number = scanner.nextInt();

                ClassWithExceptions withExceptions = new ClassWithExceptions();
                try {
                    System.out.println(withExceptions.callExceptions(number));
                } catch (Exception_2 e) {
                    e.printStackTrace();
                } catch (Exception_1 e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Произведение числа на самого себя: " + number * number);
                }

                System.out.println("Я выполняюсь.");
            }
            catch (InputMismatchException e){
                System.out.println("Вы ввели не число!");
                e.printStackTrace();
            }
   }
}

