package lesson1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите названия блюд для заказа: ");
        String DishName = scan.next();
        System.out.println("Введите количество: ");
        int sumDish = scan.nextInt();
        //System.out.println("Блюдо: " + DishName +"," + " количество: " + sumDish);
        scan.close();
        ArrayList<Dish> dish = new ArrayList<>();
        dish.add(new Drink());
        dish.add(new Food());

        /*for (Dish dish1 : dish){
            dish.printDet();
        }*/
    }
}

