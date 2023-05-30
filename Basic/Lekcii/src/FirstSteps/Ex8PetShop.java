package FirstSteps;

import java.util.Scanner;

public class Ex8PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double dogFoodQuantity = Double.parseDouble(scanner.nextLine());
        Double catFoodQuantity = Double.parseDouble(scanner.nextLine());

        Double totalPrice = 2.5 * dogFoodQuantity + 4.0 * catFoodQuantity;
        System.out.println(totalPrice);
    }
}
