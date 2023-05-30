package WhileLoop;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMooney = Double.parseDouble(scanner.nextLine());
        int countSpend = 0;
        int countDays = 0;

        while(availableMooney < neededMoney){

            if (countSpend == 5){
                break;
            }

            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            countDays++;

            if(command.equals("spend")){
                countSpend++;
                availableMooney -=currentMoney;
            } else if (command.equals("save")) {
                availableMooney += currentMoney;
                countSpend = 0;
            }

            if (availableMooney < 0){
                availableMooney = 0;
            }
        }

        if(countSpend == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        }else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
