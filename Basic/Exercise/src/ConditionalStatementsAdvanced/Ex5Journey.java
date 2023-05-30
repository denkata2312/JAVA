package ConditionalStatementsAdvanced;
import java.util.Scanner;

public class Ex5Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String accommodationType = "";
        double spendMoney = 0;

        if (budget <= 100){
            destination = "Bulgaria";

            if (season.equals("summer")){
                accommodationType = "Camp";
                spendMoney = budget * 0.3;
            } else if (season.equals("winter")) {
                accommodationType = "Hotel";
                spendMoney = budget * 0.7;
            }
        }else if (budget <= 1000){
            destination = "Balkans";

            if (season.equals("summer")){
                accommodationType = "Camp";
                spendMoney = budget * 0.4;
            } else if (season.equals("winter")) {
                accommodationType = "Hotel";
                spendMoney = budget * 0.8;
            }

        }else {
            destination = "Europe";
            accommodationType = "Hotel";
            spendMoney = budget * 0.9;

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodationType, spendMoney);

    }
}