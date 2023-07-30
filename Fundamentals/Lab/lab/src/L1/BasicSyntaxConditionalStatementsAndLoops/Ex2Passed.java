package L1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Ex2Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}