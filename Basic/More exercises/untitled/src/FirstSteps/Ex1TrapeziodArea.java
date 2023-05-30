package FirstSteps;
import java.util.Scanner;
public class Ex1TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double S = (a + b) * h / 2;
        System.out.printf("%.2f", S);

    }
}