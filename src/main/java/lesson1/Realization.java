package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Realization {

    boolean isTypeChosen = false;
    boolean isEnd = false;
    boolean isEndFull = false;
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Order> fullOrder = new ArrayList<>();
    int countOrder = 0;
    Order order = null;
    String answer = null;

    private void selectOrderType(){

        System.out.println("Вы хотите сделать онлайн заказ?  (yes/no)");
        do {
            Scanner inputAnswer = new Scanner(System.in);
            answer = inputAnswer.next();
            if (answer.equals("yes")) {
                order = new OnlineOrder();
                System.out.println("Готовим для вас онлайн заказ.");
                isTypeChosen = true;
            } else if (answer.equals("no")) {
                order = new OfflineOrder();
                System.out.println("Готовим для вас офлайн заказ.");
                isTypeChosen = true;
            } else {
                System.out.println("Мы вас не поняли.");
            }
        }
        while (!isTypeChosen);
    }

    private void processingOrder(){
        do {

            isEnd = false;
            System.out.println("Для заказа сделайте выбор от 1 до 6, 0 - завершение заказа: ");
            Scanner inputAnswer = new Scanner(System.in);
            String chosenDish = inputAnswer.next();

            if (MenuParser.parsedDrink(chosenDish) != null) {
                Drink item = MenuParser.parsedDrink(chosenDish);
                order.addDrink(item);
            } else if (MenuParser.parsedFood(chosenDish) != null) {
                order.addFood(MenuParser.parsedFood(chosenDish));
            } else if (chosenDish.equals("0")) {
                fullOrder.add(order);
                countOrder++;
                orders.add(order);
                float total = order.calculate();
                System.out.println(String.format(("Ваш заказ на сумму: %s руб."), total));
                isEnd = true;
            } else {
                System.out.println("Мы не поняли ваш выбор, попробуйте еще.");
            }
        }
        while (!isEnd);
    }

    public void basicImpl() {

        do {
            selectOrderType();
            processingOrder();
            System.out.println("Для создания нового заказа введите 1, для завершения смены 0: ");
            Scanner inputAnswer = new Scanner(System.in);
            String answer = inputAnswer.next();
            if (answer.equals("1")) {
                isEndFull = false;
            }
            else if(answer.equals("0")) {
                System.out.println("Колличество заказов: " + countOrder);
                isEndFull =true;
                float fullSum = 0;
                for (Order o:fullOrder
                     ) {
                    fullSum = o.sum + fullSum;
                }
                System.out.println("Сумма по всем заказам: " + fullSum);
            }
        }

        while (!isEndFull);

    }
}

