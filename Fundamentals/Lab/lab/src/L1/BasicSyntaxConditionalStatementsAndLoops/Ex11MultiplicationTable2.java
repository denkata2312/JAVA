package L1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Ex11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", num, times, num * times);
            times++;
        } while (times <= 10);


//        if (times > 10) {
//            int product = num * times;
//            System.out.printf("%d X %d = %d%n", num, times, product);
//        } else {
//            for (int i = times; i <= 10; i++) {
//                int product = num * i;
//                System.out.printf("%d X %d = %d%n", num, i, product);
//            }
//        }
    }
}