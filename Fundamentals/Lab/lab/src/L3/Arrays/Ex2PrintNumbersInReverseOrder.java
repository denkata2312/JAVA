package L3.Arrays;
import java.util.Scanner;

public class Ex2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];

        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbersArr.length - 1; i >=0; i--) {
            System.out.printf("%d", numbersArr[i]);
        }
    }
}