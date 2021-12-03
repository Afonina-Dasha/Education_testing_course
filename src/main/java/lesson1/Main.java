package lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ClassWithExceptions classWithExceptions = new ClassWithExceptions();


        if (number == 0){
            System.out.println("Не кратно 0");
        }
        else {
            System.out.println("Кратно 0");
        }


    }
}

