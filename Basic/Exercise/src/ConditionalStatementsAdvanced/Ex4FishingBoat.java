package ConditionalStatementsAdvanced;
import java.util.Scanner;

public class Ex4FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        double shipRent = 0;

        switch (season) {
            case "Spring":
                shipRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipRent = 4200;
                break;
            case "Winter":
                shipRent = 2600;
                break;
        }

        if (fishermanCount <= 6) {
            shipRent *= 0.9;
        } else if (fishermanCount <= 11) {
            shipRent *= 0.85;
        } else {
            shipRent *= 0.75;
        }

        if (fishermanCount % 2 == 0 && !season.equals("Autumn")) {
            shipRent *= 0.95;
        }

        double result = Math.abs(budget - shipRent);
        if (shipRent > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", result);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", result);
        }
    }
}