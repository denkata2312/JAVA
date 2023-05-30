package ConditionalStatements;
import java.util.Scanner;
public class Ex5GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double clothsPriceForOnePerson = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.1;
        double priceCloths = countExtras * clothsPriceForOnePerson;

        if(countExtras > 150){
            priceCloths = priceCloths * 0.9;
        }

        double sum = priceDecor + priceCloths;
        double difference = Math.abs(sum - budget);

        if(sum > budget){
        System.out.println("Not enough money!");
        System.out.printf("Wingard needs %.2f leva more.", difference);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}