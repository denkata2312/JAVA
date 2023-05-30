package FirstSteps;

import java.util.Scanner;

public class Ex9FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме входа
        //2. Пресмятаме обема на аквариума
        //3. Изваждаме от цялото количество процента пасяк, растения и тн.
        //4. Принтираме

        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentFilledSpace = Double.parseDouble(scanner.nextLine());

        double volumeInLitres = (length * weight * height) * 0.001;
        double neededLitres = volumeInLitres * (1 - percentFilledSpace / 100);

        System.out.println(neededLitres);
    }
}
