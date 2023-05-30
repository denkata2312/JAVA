import java.util.Scanner;

public class Ex4Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double failingStudents = 0.0;
        double averageStudents = 0.0;
        double goodStudents = 0.0;
        double excellentStudents = 0.0;
        double averageGrade = 0.0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade>=2.00 && grade<=2.99) {
                failingStudents++;
                averageGrade += grade;
            }
            if (grade>=3.00 && grade<=3.99) {
                averageStudents++;
                averageGrade += grade;
            }
            if (grade>=4.00 && grade<=4.99) {
                goodStudents++;
                averageGrade += grade;
            }
            if (grade>=5.00) {
                excellentStudents++;
                averageGrade += grade;
            }

        }
        System.out.printf("Top students: %.2f%%\n", excellentStudents/students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudents/students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", averageStudents/students * 100);
        System.out.printf("Fail: %.2f%%\n", failingStudents/students * 100);
        System.out.printf("Average: %.2f", averageGrade/students);
    }
}