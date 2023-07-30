import java.util.Scanner;

public class Ex1TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerPerson = Double.parseDouble(scanner.nextLine());
        double foodPerPerson = Double.parseDouble(scanner.nextLine());

        double totalWater = waterPerPerson * players * days;
        double totalFood = foodPerPerson * players * days;

        for (int day = 1; day <= days; day++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            energy -= energyLoss;

            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                return;
            }

            if (day % 2 == 0) {
                double waterToDrink = 0.3 * totalWater;
                totalWater -= waterToDrink;
            }

            if (day % 3 == 0) {
                double foodToEat = totalFood / players;
                totalFood -= foodToEat;
                energy *= 1.1;
            }
        }
        System.out.printf("You are ready for the quest. You will be left with %.2f energy!", energy);
    }
}