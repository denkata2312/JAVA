package FirstSteps;

import java.util.Scanner;

public class Ex3DepositCalculator {
    public static void main(String[] args) {
        /*1.Четем от конзолата
           - депозирана сума -> double
           - срок на депозита -> int
           - годишен лихвен процес ->  double
          2.Изчисляване натрупаната лихва за 1 месец
          3.Изчисляваме лихвата на всички месеци
          4.Пресметнен общата сума -> депозираната сума + натруаната лихва
            сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
          5.Принтираме
        */

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double amountPerMonth = (deposit * (percentPerYear / 100)) / 12;

        double totalSum = deposit + amountPerMonth * months;

        System.out.println(totalSum);
    }
}
