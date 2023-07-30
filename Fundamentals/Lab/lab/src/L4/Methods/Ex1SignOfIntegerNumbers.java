package L4.Methods;
import java.util.Scanner;

public class Ex1SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printNumber(n);
    }

    public static void printNumber(int n){
        String sign = "";
        if( n < 0){
            sign = "negative";
        } else if (n > 0) {
            sign = "positive";
        }else {
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", n, sign);
    }
}