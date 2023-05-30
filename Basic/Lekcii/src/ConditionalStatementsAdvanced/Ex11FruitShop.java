package ConditionalStatementsAdvanced;
import java.util.Scanner;

public class Ex11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double banana = 2.50;
        double apple = 1.20;
        double orange = 0.85;
        double grapefruit = 1.45;
        double kiwi = 2.70;
        double pineapple = 5.50;
        double grapes = 3.85;

        double weekend_banana = 2.70;
        double weekend_apple = 1.25;
        double weekend_orange = 0.90;
        double weekend_grapefruit = 1.60;
        double weekend_kiwi = 3.00;
        double weekend_pineapple = 5.60;
        double weekend_grapes = 4.20;

        if (fruit.equals("banana") && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))) {
            System.out.printf("%.2f", quantity * banana);
        }else if ((fruit.equals("apple")) && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))) {
            System.out.printf("%.2f", quantity * apple);
        }else if ((fruit.equals("orange")) && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))) {
            System.out.printf("%.2f", quantity * orange);
        }else if ((fruit.equals("grapefruit")) && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))) {
            System.out.printf("%.2f", quantity * grapefruit);
        }else if ((fruit.equals("kiwi")) && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))){
            System.out.printf("%.2f", quantity * kiwi);
        }else if ((fruit.equals("pineapple")) && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))){
            System.out.printf("%.2f", quantity * pineapple);
        }else if ((fruit.equals("grapes")) && (day.equals("Monday") || (day.equals("Tuesday") || day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday"))))){
            System.out.printf("%.2f", quantity * grapes);
        }else if ((fruit.equals("banana")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_banana);
        }else if ((fruit.equals("apple")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_apple);
        }else if ((fruit.equals("orange")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_orange);
        }else if ((fruit.equals("grapefruit")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_grapefruit);
        }else if ((fruit.equals("kiwi")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_kiwi);
        }else if ((fruit.equals("pineapple")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_pineapple);
        }else if ((fruit.equals("grapes")) && (((day.equals("Saturday")) || (day.equals("Sunday"))))) {
            System.out.printf("%.2f", quantity * weekend_grapes);
        }else {
            System.out.println("error");
        }
    }
}