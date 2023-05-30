package ForLoop;
import java.util.Scanner;

public class Ex8TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournament = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int countWin = 0;
        int sumAllTournamentPoints = 0;

        for (int i = 1; i <= countTournament ; i++) {
            String currentStage = scanner.nextLine();

            if(currentStage.equals("W")){
                countWin++;
                sumAllTournamentPoints += 2000;
            } else if (currentStage.equals("F")) {
                sumAllTournamentPoints += 1200;
            } else if (currentStage.equals("SF")) {
                sumAllTournamentPoints += 720;
            }
        }

        int finalPoints = startingPoints + sumAllTournamentPoints;
        int averagePoints = sumAllTournamentPoints / countTournament;
        double percentWin = (countWin * 1.0/ countTournament) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentWin);
    }
}