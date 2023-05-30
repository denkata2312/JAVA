import java.util.Scanner;
public class Ex2DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysWithoutSanta = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double food1DeerKg = Double.parseDouble(scanner.nextLine());
        double food2DeerKg = Double.parseDouble(scanner.nextLine());
        double food3DeerKg = Double.parseDouble(scanner.nextLine());
        double totalFood = (food1DeerKg + food2DeerKg + food3DeerKg) * daysWithoutSanta;

        double foodLeft = Math.floor(foodLeftKg - totalFood);
        double foodNeeded = Math.ceil(totalFood - foodLeftKg);

        if (totalFood < foodLeftKg) {
            System.out.printf("%s kilos of food left.", (int) foodLeft);
        } else if (totalFood > foodLeftKg) {
            System.out.printf("%s more kilos of food are needed.", (int) foodNeeded);
        }
    }
}