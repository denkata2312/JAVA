package FirstSteps;
import java.util.Scanner;
public class Ex4VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgOfVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgOfFruits = Integer.parseInt(scanner.nextLine());

        double vegetablesCost = priceForKgVegetables * totalKgOfVegetables;
        double fruitsCost = priceForKgFruits * totalKgOfFruits;

        double totalIncomeOfFruitsAndVegetables = vegetablesCost + fruitsCost;

        System.out.printf("%.2f", totalIncomeOfFruitsAndVegetables / 1.94);
    }
}