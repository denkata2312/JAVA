import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2BossRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String boss = matcher.group("boss");
                String title = matcher.group("title");
                System.out.println(String.format("%s, The %s", boss, title));
                System.out.println(String.format(">> Strength: %d", boss.length()));
                System.out.println(String.format(">> Armor: %d", title.length()));
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}