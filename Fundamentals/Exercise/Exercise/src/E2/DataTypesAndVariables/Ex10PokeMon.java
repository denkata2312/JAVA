package E2.DataTypesAndVariables;
import java.util.Scanner;

public class Ex10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int startPower = power; //първоначалната сила
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int count = 0;
        while (power >= distance) {
            power -= distance;
            count++;

            if (power == startPower / 2) {
                boolean isDivisible = factor != 0;
                if (isDivisible) {
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}