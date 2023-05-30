package ForLoop;
import java.util.Scanner;

public class Ex4CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceForToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int countToys = 0;
        double moneyEvenAge = 10;

        for (int currentAge = 1; currentAge  <= age; currentAge ++) {

            if(currentAge % 2 == 0){
               //sum = sum + (currentAge * 5 - 1);

               sum += moneyEvenAge;
               moneyEvenAge += 10;
               sum--;

            }else {
                countToys++;
            }
        }

        sum += countToys * priceForToy;

        double diff =Math.abs(sum - priceWashingMachine);

        if(sum >= priceWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}