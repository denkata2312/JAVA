package FirstSteps;

import java.util.Scanner;
public class Ex7FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*1.Пилешко меню – 10.35 лв.
            Меню с риба – 12.40 лв.
            Вегетарианско меню – 8.15 лв.
            доставка - 2.50 лв.
        * */

        double chicken = 10.35;
        double fish = 12.40;
        double vegetarian = 8.15;

        int chickenMeal = Integer.parseInt(scanner.nextLine());
        int fishMeal = Integer.parseInt(scanner.nextLine());
        int vegetarianMeal = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMeal * chicken;
        double fishPrice = fishMeal * fish;
        double vegetarianPrice = vegetarianMeal * vegetarian;
        double allPrice = chickenPrice + fishPrice + vegetarianPrice;

        double discount = allPrice * 0.20;
        double delivery = 2.50;

        double Price = discount + allPrice + delivery;

        System.out.printf("Total: %.2f",Price);
    }
}