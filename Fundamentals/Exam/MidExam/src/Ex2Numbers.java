import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = readSequence(scanner);

        String command;
        while (!(command = scanner.nextLine()).equals("Finish")) {
            String[] tokens = command.split(" ");
            String operation = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            switch (operation) {
                case "Add":
                    addValue(sequence, value);
                    break;
                case "Remove":
                    removeValue(sequence, value);
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(tokens[2]);
                    replaceValue(sequence, value, replacement);
                    break;
                case "Collapse":
                    collapseValues(sequence, value);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        printSequence(sequence);
    }

    private static List<Integer> readSequence(Scanner scanner) {
        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> sequence = new ArrayList<>();
        for (String number : numbers) {
            sequence.add(Integer.parseInt(number));
        }
        return sequence;
    }

    private static void addValue(List<Integer> sequence, int value) {
        sequence.add(value);
    }

    private static void removeValue(List<Integer> sequence, int value) {
        sequence.remove(Integer.valueOf(value));
    }

    private static void replaceValue(List<Integer> sequence, int value, int replacement) {
        int index = sequence.indexOf(value);
        if (index != -1) {
            sequence.set(index, replacement);
        }
    }

    private static void collapseValues(List<Integer> sequence, int value) {
        sequence.removeIf(num -> num < value);
    }

    private static void printSequence(List<Integer> sequence) {
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i));
            if (i < sequence.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}