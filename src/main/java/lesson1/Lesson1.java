package lesson1;

import java.util.Scanner;

public class Lesson1 {
    public Lesson1() {
    }

    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ruble: ");
        float ruble = scan.nextFloat();
        System.out.println("Enter dollar rate: ");
        float dollar_rate = scan.nextFloat();
        float result = ruble / dollar_rate;
        System.out.println("Result: " + result);
    }
    public static void task2() {
        String numbers = "41072819";
        char[] charArr = numbers.toCharArray();
        String four =
                       "      4\n"  +
                        "    4 4\n"  +
                        "   4  4\n"  +
                        "  4   4\n"  +
                        " 444444\n"  +
                        "      4\n"  +
                        "      4\n";

        String one =
                        "      1\n " +
                        "    11\n " +
                        "     1\n " +
                        "     1\n " +
                        "     1\n " +
                        "     1\n " +
                        "    111\n";

        String zero =
                        "   000\n"   +
                        "  0   0\n"  +
                        " 0     0\n" +
                        " 0     0\n" +
                        " 0     0\n" +
                        "  0   0\n"  +
                        "   000\n ";

        String seven =
                        "777777\n " +
                        "     7\n " +
                        "    7\n  " +
                        "  7\n" +
                        " 7\n" +
                        "7\n" +
                        "7\n";

        String two =
                        " 222\n" +
                        "2    2\n" +
                        "2    2\n " +
                        "   2\n" +
                        "  2\n" +
                        " 2\n" +
                        "222222\n";

        String eight =
                         " 888\n" +
                        "8   8\n"+
                        "8   8\n"+
                        " 888\n" +
                        "8   8\n"+
                        "8   8\n"+
                        " 888\n";

        String nine =
                        "9999\n"+
                        "9    9\n"+
                        "9    9\n"+
                        " 9999\n"+
                        "    9\n"+
                        "    9\n"+
                        "    9\n";

        char[] var9 = charArr;
        int var10 = charArr.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            char i = var9[var11];
            switch(i) {
                case '0':
                    System.out.println(zero);
                    break;
                case '1':
                    System.out.println(one);
                    break;
                case '2':
                    System.out.println(two);
                case '3':
                case '5':
                case '6':
                default:
                    break;
                case '4':
                    System.out.println(four);
                    break;
                case '7':
                    System.out.println(seven);
                    break;
                case '8':
                    System.out.println(eight);
                    break;
                case '9':
                    System.out.println(nine);
            }
        }

    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int num = scan.nextInt();
        if (num > 0) {
            int time = num / 60;
            int minutes = num - time * 60;
            String time_1 = String.format("%02d", time);
            String minutes_1 = String.format("%02d", minutes);
            System.out.printf(time_1 + " часов и " + minutes_1 + " минут");
        } else {
            System.out.println("Please enter a non-negative integer!");
        }

    }

    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] mass = new int[10];

        int max;
        for(max = 0; max < mass.length; ++max) {
            mass[max] = scan.nextInt();
        }

        max = mass[0];

        for(int i = 0; i < mass.length; ++i) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }

        System.out.println("Max element = " + max);
    }

    public static void task5() {
        System.out.print("Кто - кто в теремочке живет?");
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        for(int i = 0; i < 5 && !exit; ++i) {
            String answer = scan.next();
            String var4 = answer.toLowerCase();
            byte var5 = -1;
            switch(var4.hashCode()) {
                case 1034358914:
                    if (var4.equals("мишка")) {
                        var5 = 2;
                    }
                    break;
                case 1034924943:
                    if (var4.equals("мышка")) {
                        var5 = 0;
                    }
                    break;
                case 1633369626:
                    if (var4.equals("лягушка")) {
                        var5 = 1;
                    }
            }

            switch(var5) {
                case 0:
                case 1:
                case 2:
                    System.out.println("Загадка отгадана!");
                    exit = true;
                    break;
                default:
                    System.out.println("Ответ неверный, попробуй еще раз.");
            }
        }

    }
}
