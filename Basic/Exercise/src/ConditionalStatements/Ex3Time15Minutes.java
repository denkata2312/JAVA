package ConditionalStatements;
import java.util.Scanner;
public class Ex3Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + minutes + 15;

        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes %60;

        if(finalHours < 24){
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        }else {
            finalHours = 0;
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        }
    }
}