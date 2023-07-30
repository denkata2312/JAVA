import java.util.Scanner;

public class Ex1StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        while (true) {
            // Read the command
            String commandLine = scanner.nextLine();

            if (commandLine.equals("Done")) {
                break;
            }

            // Split the command into parts
            String[] commandParts = commandLine.split(" ");

            // Execute the corresponding command
            switch (commandParts[0]) {
                case "Change":
                    char charToReplace = commandParts[1].charAt(0);
                    char replacement = commandParts[2].charAt(0);
                    inputString = inputString.replace(charToReplace, replacement);
                    System.out.println(inputString);
                    break;
                case "Includes":
                    String substring = commandParts[1];
                    System.out.println(inputString.contains(substring) ? "True" : "False");
                    break;
                case "End":
                    String endSubstring = commandParts[1];
                    System.out.println(inputString.endsWith(endSubstring) ? "True" : "False");
                    break;
                case "Uppercase":
                    inputString = inputString.toUpperCase();
                    System.out.println(inputString);
                    break;
                case "FindIndex":
                    char charToFind = commandParts[1].charAt(0);
                    int index = inputString.indexOf(charToFind);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int count = Integer.parseInt(commandParts[2]);
                    String cutChars = inputString.substring(startIndex, startIndex + count);
                    System.out.println(cutChars);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        scanner.close();
    }
}
