package NestedLoops;
import java.util.Scanner;

public class Ex4SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int count = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                count++;
                int sum = i + j;

                if (sum == magicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, sum);
                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d%n", count, magicNum);
        }
    }
}