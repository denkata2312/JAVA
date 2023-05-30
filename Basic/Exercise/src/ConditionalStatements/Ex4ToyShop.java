package ConditionalStatements;
import java.util.Scanner;
public class Ex4ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalToysCount = puzzles + dolls + bears + minions + trucks;
        double totalSum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;

        if(totalToysCount >= 50){
            totalSum = totalSum - totalSum *0.25;
        }

        totalSum = totalSum * 0.9;

        if (totalSum >= tripPrice){
            double moneyLeft = totalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }else{
            double neededMoney = tripPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}