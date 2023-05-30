package WhileLoop;
import java.util.Scanner;

public class Ex2ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrade = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();

        int countPoorGrades = 0;
        int sumGrades = 0;
        int countTasks = 0;
        String lastTask = "";

        while (!task.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades += grade;
            countTasks++;
            if (grade <= 4) {
                countPoorGrades++;
            }
            if (countPoorGrades == maxPoorGrade) {
                System.out.printf("You need a break, %d poor grades.", countPoorGrades);
                break;
            }
            lastTask = task;
            task = scanner.nextLine();
        }
        if (task.equals("Enough")) {
            double average = sumGrades * 1.0 / countTasks;
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", countTasks);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}