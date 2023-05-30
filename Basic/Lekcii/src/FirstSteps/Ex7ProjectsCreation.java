package FirstSteps;

import java.util.Scanner;

public class Ex7ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());

        int hours = projectsCount * 3;

        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + projectsCount + " project/s.");
    }
}