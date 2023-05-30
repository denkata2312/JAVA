package ConditionalStatementsAdvanced;
import java.util.Scanner;

public class Ex8OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = examHour * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinutes;

        int diff = Math.abs(arrivalTotalMinutes - examTotalMinutes);

        if(arrivalTotalMinutes > examTotalMinutes){
            System.out.println("Late");
            if(diff < 60){
                System.out.printf("%d minutes after the start", diff);
            }else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }else  if(diff <= 30){
            System.out.printf("On time ");
            if(examTotalMinutes != arrivalTotalMinutes){
                System.out.printf("%d minutes before the start", diff);
            }
        }else {
            System.out.printf("Early ");
            if (diff < 60){
                System.out.printf("%d minutes before the start", diff);
            }else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}