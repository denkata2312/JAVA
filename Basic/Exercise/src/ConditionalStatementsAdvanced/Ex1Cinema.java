package ConditionalStatementsAdvanced;
import java.util.Scanner;

public class Ex1Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projections = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0.0;

        if("Premiere".equals(projections)){
            income = rows * columns * 12;
        } else if ("Normal".equals(projections)) {
            income = rows * columns * 7.50;
        } else if ("Discount".equals(projections)) {
            income = rows * columns * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}