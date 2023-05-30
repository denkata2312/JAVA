package FirstSteps;

import java.util.Scanner;
public class Ex1USDtoBGN {
    public static void main(String[] args) {

        //1.Четем потребителски вход
        //2.Пресметнем стойността за български лева ->1 USD = 1.79549 BGN
        //3. Принтираме конзолата

        Scanner scan = new Scanner(System.in);
        double usd =  Double.parseDouble((scan.nextLine()));
        double bgn = usd *1.79549;
        System.out.println(bgn);
    }
}