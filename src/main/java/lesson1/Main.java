package lesson1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean isTypeChosen = false;
        boolean isEnd = false;
        ArrayList<Order> orders = new ArrayList<>(); // сохраняем сюда заказы
        Order order = null;

        //Создаем новый заказ
        System.out.println("Вы хотите сделать онлайн заказ?  (yes/no)");
        do {
            Scanner inputAnswer = new Scanner(System.in);
            if (inputAnswer.next().equals("yes")) {
                order = new OnlineOrder();
                System.out.println("Мы готовим для вас онлайн заказ.");
                isTypeChosen = true;
            } else if (inputAnswer.next().equals("no")) {
                order = new OfflineOrder();
                System.out.println("Мы готовим для вас офлайн заказ.");
                isTypeChosen = true;
            } else {
                System.out.println("Мы вас не поняли.");
            }
        }
            while (!isTypeChosen);


            //Блок обработки заказа
            do {
                System.out.println("Для заказа сделайте выбор от 1 до 6, 0 -завершение заказа: ");
                Scanner inputAnswer = new Scanner(System.in);
                String chosenDish = inputAnswer.next();

                if (MenuParser.parsedDrink(chosenDish) != null) {//узнаем, есть ли мы в этом диапозоне
                    Drink item = MenuParser.parsedDrink(chosenDish);//parsedDrink принимает на вход значение, которое ввел пользователь
                    order.addDrink(item);
                } else if (MenuParser.parsedFood(chosenDish) != null) {
                    order.addFood(MenuParser.parsedFood(chosenDish));
                } else if (chosenDish.equals("0")) {
                    orders.add(order);
                    float total = order.calculate();// подсчитывание суммы заказа
                    System.out.println(String.format(("Ваш заказ на сумму: %s руб."), total));
                    isEnd = true; // переменная для завершения цикла
                } else {
                    System.out.println("Мы не поняли ваш выбор, попробуйте еще.");
                }
            }
            while (!isEnd);
    }
}

