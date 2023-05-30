package ForLoop;
import java.util.Scanner;

public class Ex10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if(i % 2 == 0){
                evenSum += currentNum;
            }else {
                oddSum += currentNum;
            }
        }

        if(evenSum == oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", evenSum);
        }else {
            System.out.println("No");
            int diff = Math.abs(evenSum - oddSum);
            System.out.printf("Diff = %d%n", diff);
        }
    }
}