package E8.TextProcessing;
import java.util.Scanner;

public class Ex4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни -> текст
        String text = scanner.nextLine(); //"Programming is cool!"

        for (char symbol : text.toCharArray()) {
            //'A' -> 'D'
            char encryptSymbol = (char) (symbol + 3);
            System.out.print(encryptSymbol);
        }
    }
}