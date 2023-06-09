package PodgotovkaZaIzpit;
import java.util.Scanner;

public class Ex1PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allFee = people * entranceFee;
        double allChairs = Math.ceil(people * 0.75) * chairPrice;
        double allUmbrellas = Math.ceil(people * 0.50)  * umbrellaPrice;

        double totalSum = allFee + allChairs + allUmbrellas;

        System.out.printf("%.2f lv.", totalSum);
    }
}