package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Realization {

    private Object ArrayList;

    boolean isTypeChosen = false;
    boolean isEnd = false;
    boolean isEndFull = false;
    ArrayList<Order> orders = new ArrayList<>(); // сохраняем сюда заказы
    ArrayList<Order> fullOrder = new ArrayList<>();
    int countOrder = 0;
    Order order = null;
    int number = 0;
    int totalSum = 0;
    String answer = null;

    public void fullReport() {

        while (true) {
            number = number + 1;
            //totalSum = totalSum + basicImpl(); //доделать
            System.out.println(System.getProperty("Вывести полный отчет по заказам за день?"));
            Scanner inputAnswer = new Scanner(System.in);
            String answer = inputAnswer.next();
            if (answer.toLowerCase().equals("да")) {
                System.out.println("Колличество заказов: " + number);
                System.out.println("Итоговая сумма по заказам: " + totalSum);
                break;
            }

        }
    }
    private void selectOrderType(){
        //Создаем новый заказ
        System.out.println("Вы хотите сделать онлайн заказ?  (yes/no)");
        do {
            Scanner inputAnswer = new Scanner(System.in);
            answer = inputAnswer.next();
            if (answer.equals("yes")) {
                order = new OnlineOrder();
                System.out.println("Мы готовим для вас онлайн заказ.");
                isTypeChosen = true;
            } else if (answer.equals("no")) {
                order = new OfflineOrder();
                System.out.println("Мы готовим для вас офлайн заказ.");
                isTypeChosen = true;
            } else {
                System.out.println("Мы вас не поняли.");
            }
        }
        while (!isTypeChosen);
    }
    private void processingOrder(){ // //Блок обработки заказа
        do {
            isEnd = false;
            System.out.println("Для заказа сделайте выбор от 1 до 6, 0 -завершение заказа: ");
            Scanner inputAnswer = new Scanner(System.in);
            String chosenDish = inputAnswer.next();

            if (MenuParser.parsedDrink(chosenDish) != null) {//узнаем, есть ли мы в этом диапозоне
                Drink item = MenuParser.parsedDrink(chosenDish);//parsedDrink принимает на вход значение, которое ввел пользователь
                order.addDrink(item);
            } else if (MenuParser.parsedFood(chosenDish) != null) {
                order.addFood(MenuParser.parsedFood(chosenDish));
            } else if (chosenDish.equals("0")) {
                fullOrder.add(order);
                countOrder++;
                orders.add(order); //после завершения, складываем заказы в массив
                float total = order.calculate();// подсчитывание суммы заказа
                System.out.println(String.format(("Ваш заказ на сумму: %s руб."), total));
                isEnd = true; // переменная для завершения цикла
            } else {
                System.out.println("Мы не поняли ваш выбор, попробуйте еще.");
            }
        }
        while (!isEnd);
    }

    public void basicImpl() {
        do{
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

