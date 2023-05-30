package ForLoop;
import java.util.Scanner;

public class Ex1NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 7; i < 1000; i += 10) {

                System.out.println(i);
        }
    }
}