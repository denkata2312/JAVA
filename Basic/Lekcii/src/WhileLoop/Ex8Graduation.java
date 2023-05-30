package WhileLoop;
import java.util.Scanner;

public class Ex8Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int poorGradesCount = 0;
        double sumGrades = 0;
        int year = 1;

        while(year <= 12) {
            if(poorGradesCount > 1) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if(currentGrade < 12) {
                poorGradesCount++;
                continue;
            }

            sumGrades = sumGrades + currentGrade;
            year++;
        }

        if (poorGradesCount > 1){
            System.out.printf("%s has been excluded at %d grade", name, year);
        }else{
            double avgGrade = sumGrades / 4;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, avgGrade);
        }
    }
}