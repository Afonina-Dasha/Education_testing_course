package lesson1;

import java.util.Scanner;

public class ScannerAsk {
    public int checkIsNotNumber()
    {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.println("Введите число:");
            try {
                int answer = input.nextInt();
                return answer;
            }
            catch (java.util.InputMismatchException e)
            {
                input.nextLine();
            }
        }
    }
}
