package FirstSteps;

import java.util.Scanner;

public class Ex4VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int timeForRead = pages /hour;
        int hoursTimeForRead = timeForRead / days;

        System.out.println(hoursTimeForRead);
    }
}