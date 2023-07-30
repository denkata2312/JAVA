package L1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Ex7TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        boolean isValid = true;

        int price = 0;
        if (age >= 0 && age <= 18) {
            if (typeDay.equals("Weekday"))  {
                price = 12;
            } else if (typeDay.equals("Weekend")) {
                price = 15;
            } else if (typeDay.equals("Holiday")) {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (typeDay.equals("Weekday")) {
                price = 18;
            } else if (typeDay.equals("Weekend")) {
                price = 20;
            } else if (typeDay.equals("Holiday")) {
                price = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (typeDay.equals("Weekday")) {
                price = 12;
            } else if (typeDay.equals("Weekend")) {
                price = 15;
            } else if (typeDay.equals("Holiday")) {
                price = 10;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.println(price + "$");
        } else {
            System.out.println("Error!");
        }
    }
}