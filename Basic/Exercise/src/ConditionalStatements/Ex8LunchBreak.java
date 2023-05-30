package ConditionalStatements;
import java.util.Scanner;
public class Ex8LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double timeForEat = lunchBreak / 8.0;
        double timeForRest = lunchBreak / 4.0;

        double timeForWatch = lunchBreak - timeForEat - timeForRest;

        if(timeForWatch >= duration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, Math.ceil(timeForWatch - duration));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName, Math.ceil(duration - timeForWatch));
        }
    }
}