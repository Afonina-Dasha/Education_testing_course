package lesson_cafe;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean isTypeChosen = false;
        boolean isEnd = false;
        ArrayList<Order> orders = new ArrayList<>();
        Order order = null;

        //Создаем новый заказ
        System.out.println("Вы хотите сделать онлайн заказ?  (yes/no)" );
        do{
            Scanner inputAnswer = new Scanner(System.in);
            if(inputAnswer.next().equals("yes")){
                order = new OnlineOrder();
                System.out.println("Мы готовим для вас онлайн заказ.");
                isTypeChosen = true;
            }
            else if (inputAnswer.next().equals("no")){
                order = new OfflineOrder();
                System.out.println("Мы готовим для вас офлайн заказ.");
                isTypeChosen = true;
            }
            else {
                System.out.println("Мы вас не поняли.");
            }
        while (!isTypeChosen);

        //Блок обработки заказа
        do{
            System.out.println("Для заказа сделайте выбор от 1 до 6, 0 -завершение заказа: ");
            Scanner inputAnswer = new Scanner(System.in);
            String chosenDish = inputAnswer.next();

            if(MenuParser.parsedDrink(chosenDish) != null){
                Dish item = MenuParser.parsedDrink(chosenDish);
                order.addItem;
            }
            else if(MenuParser.parsedFood(chosenDish) != null){
                order.addItem(MenuParser.parsedFood(chosenDish));
            }
            else if(chosenDish.equals("0")){
                orser.add(orser);
                System.out.println(order.calculate());
                isEnd = true;
            }
            else {
                System.out.println("Мы не поняли ваш выбор, попробуйте еще.");
            }
        }
        while (!isEnd);
    }
}

