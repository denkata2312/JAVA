package ForLoop;
import java.util.Scanner;

public class Ex7TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        int peopleClimberMusala = 0;
        int peopleClimberMonblan = 0;
        int peopleClimberKilimadjaro = 0;
        int peopleClimberK2 = 0;
        int peopleClimberEverest = 0;
        int allPeople = 0;

        for (int i = 1; i <= countPeople; i++) {
            int countClimbers = Integer.parseInt(scanner.nextLine());
            allPeople +=countClimbers;
            if (countClimbers <= 5) {
                peopleClimberMusala += countClimbers;
            }else if( countClimbers <= 12){
                peopleClimberMonblan += countClimbers;
            }else if(countClimbers <= 25){
                peopleClimberKilimadjaro += countClimbers;
            }else if(countClimbers <= 40){
                peopleClimberK2 += countClimbers;
            }else{
                peopleClimberEverest += countClimbers;
            }
        }
        double peopleMusala = ((double)peopleClimberMusala / allPeople) * 100.0;
        System.out.printf("%.2f%%%n", peopleMusala);
        double peopleMonblan = ((double)peopleClimberMonblan / allPeople) * 100.0;
        System.out.printf("%.2f%%%n", peopleMonblan);
        double peopleKilimadjaro = ((double)peopleClimberKilimadjaro / allPeople) * 100.0;
        System.out.printf("%.2f%%%n", peopleKilimadjaro);
        double peopleK2 = ((double)peopleClimberK2 / allPeople) * 100.0;
        System.out.printf("%.2f%%%n", peopleK2);
        double peopleEverest = ((double)peopleClimberEverest / allPeople) * 100.0;
        System.out.printf("%.2f%%%n", peopleEverest);
    }
}