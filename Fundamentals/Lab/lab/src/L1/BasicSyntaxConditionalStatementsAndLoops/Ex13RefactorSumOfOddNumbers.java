package L1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Ex13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print( 2 * i + 1);
            sum += 2 * i;
        }

        System.out.printf("\nSum: %d", sum);
    }
}