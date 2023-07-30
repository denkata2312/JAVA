package L1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Ex4BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sumMin = (hour * 60) + min + 30;

        int resultHour = sumMin / 60;
        int resultMin = sumMin % 60;

        if (resultHour > 23) {
            resultHour = 0;
        }
        System.out.printf("%d:%02d", resultHour, resultMin);
    }
}