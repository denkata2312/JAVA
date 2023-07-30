package E1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class EX6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int startNumber = number;

        while(number >0) {
            int LastDigit = number % 10;

            int fact = 1;
            for (int i = 1; i <= LastDigit; i++) {
                fact = fact * i;
            }

            sumFact += fact;

            number = number / 10;
        }

        if(sumFact == startNumber) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}