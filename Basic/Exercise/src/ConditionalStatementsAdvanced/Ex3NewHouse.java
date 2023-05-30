package ConditionalStatementsAdvanced;
import java.util.Scanner;

public class Ex3NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flowersType){
            case "Roses":
                price = countFlowers * 5;
                if (countFlowers > 80){
                    price = price * 0.9;
                }
                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers > 90){
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = countFlowers * 2.80;
                if (countFlowers > 80){
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = countFlowers * 3;
                if (countFlowers < 120){
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = countFlowers * 2.50;
                if (countFlowers < 80){
                    price = price * 1.20;
                }
                break;

        }

        double diff = Math.abs(budget - price);

        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowersType, diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}