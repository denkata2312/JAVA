package E3.Arrays;
import java.util.Scanner;

public class Ex2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split("\\s+"); // "Hey hello 2 4" -> ["Hey", "hello", "2", "4"]
        String [] secondArray = scanner.nextLine().split(" "); //"10 hey 4 hello" -> ["10", "hey", "4", "hello"]

        //за всеки елемент на втория масив -> проверка дали го има в първия масив
        for (String el2 : secondArray) {
            for (String el1 : firstArray) {
                if (el2.equals(el1)) {
                    System.out.print(el1 + " ");
                }
            }
        }
    }
}