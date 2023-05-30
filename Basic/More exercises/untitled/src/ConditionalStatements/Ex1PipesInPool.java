package ConditionalStatements;
import java.util.Scanner;

public class Ex1PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double water = p1*h + p2*h;

        if (water<=v){
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",
                    Math.floor(water/v*100),
                    Math.floor(p1*h/water*100),
                    Math.floor(p2*h/water*100));
        }else{
            System.out.printf("For %f.0f%% hours the pool overflows with %f liters.", h, water - v);
        }
    }
}