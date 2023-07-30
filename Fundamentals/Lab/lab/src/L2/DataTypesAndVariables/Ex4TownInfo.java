package L2.DataTypesAndVariables;
import java.util.Scanner;

public class Ex4TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %s and area %s square km.", townName, population, area);
    }
}