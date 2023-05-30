import java.util.Scanner;

public class Ex1ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packingPaper = 5.80;
        double Fabric = 7.20;
        double glue = 1.20;

        int rollsPaper = Integer.parseInt(scanner.nextLine());
        int rollsFabric = Integer.parseInt(scanner.nextLine());
        double litresGlue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePaper = rollsPaper * packingPaper;
        double priceFabric = Fabric * rollsFabric;
        double priceGlue = litresGlue * glue;

        double sum = (pricePaper + priceFabric + priceGlue) * (100-discount ) / 100;

        System.out.printf("%.3f", sum);
    }
}