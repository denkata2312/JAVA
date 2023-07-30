package L4.Methods;
import java.util.Scanner;

public class Ex2Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputGrade = Double.parseDouble(scanner.nextLine());
        printGrade(inputGrade);
    }

    public static void printGrade(double grade){
        String word ="";
        if( grade >= 2 && grade <= 2.99){
            word = "Fail";
        } else if (grade >= 3 && grade <= 3.49) {
            word = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            word = "Good";
        }else if (grade >= 4.50 && grade <= 5.49){
            word = "Very good";
        } else if (grade >= 5.5) {
            word ="Excellent";
        }
        System.out.println(word);
    }
}