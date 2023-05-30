package ConditionalStatements;
import java.util.Scanner;
public class Ex7Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countCPU = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());

        double sumVideoCards = countVideoCards * 250;
        double sumCPU = (sumVideoCards * 0.35) * countCPU;
        double ramPrice = (sumVideoCards * 0.1) * countRAM;
        double totalSum = sumVideoCards + sumCPU + ramPrice;

        if(countVideoCards > countCPU){
            totalSum = totalSum - totalSum * 0.15;
        }
        double moneyLeft = budget - totalSum;
        double moneyNeeded = totalSum - budget;

        if(budget >= totalSum){
            System.out.printf("You have %.2f leva left!", moneyLeft);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);
        }
    }
}