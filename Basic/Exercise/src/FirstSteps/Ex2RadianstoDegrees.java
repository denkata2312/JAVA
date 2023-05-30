package FirstSteps;

import java.util.Scanner;
public class Ex2RadianstoDegrees {
    public static void main(String[] args) {

        //1.Четем от конзолата
        //2.Преобразуваме от радиани в градуси -> градус = радиан * 180 / п
        //3.Принтиране на конзолата

        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians *180/ Math.PI;
        System.out.println(degrees);
    }
}