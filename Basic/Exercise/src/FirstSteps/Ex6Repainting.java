package FirstSteps;

import java.util.Scanner;

public class Ex6Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt((scanner.nextLine()));
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (neededNylon + 2) * 1.50;
        double paintPrice = (neededPaint + (neededPaint * 0.1)) * 14.50;
        double thinnedPrice= thinner *5.00;

        double materialSum = nylonPrice + paintPrice + thinnedPrice + 0.40;

        double priceForBuilders = hours * (materialSum * 0.30);

        double finalSum = priceForBuilders + materialSum;

        System.out.println(finalSum);
    }
}