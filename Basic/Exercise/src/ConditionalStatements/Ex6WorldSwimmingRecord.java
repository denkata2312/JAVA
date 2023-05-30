package ConditionalStatements;
import java.util.Scanner;
public class Ex6WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay =(Math.floor(distance /15 )) * 12.5;

        double result = distance * timeForOneMeter + delay;

        if(recordInSeconds > result ){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }else{
            double needSeconds = result - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", needSeconds);
        }
    }
}