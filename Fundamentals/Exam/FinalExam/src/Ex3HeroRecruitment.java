import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3HeroRecruitment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, ArrayList<String>> heroes = new HashMap<>();

        String input = scan.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String heroName = tokens[1];

            switch (command) {
                case "Enroll":
                    if (heroes.containsKey(heroName)) {
                        System.out.println(heroName + " is already enrolled.");
                    } else {
                        heroes.put(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    if (heroes.containsKey(heroName)) {
                        String spellName = tokens[2];
                        ArrayList<String> spells = heroes.get(heroName);
                        if (spells.contains(spellName)) {
                            System.out.println(heroName + " has already learnt " + spellName + ".");
                        } else {
                            spells.add(spellName);
                        }
                    } else {
                        System.out.println(heroName + " doesn't exist.");
                    }
                    break;
                case "Unlearn":
                    if (heroes.containsKey(heroName)) {
                        String spellName = tokens[2];
                        ArrayList<String> spells = heroes.get(heroName);
                        if (spells.contains(spellName)) {
                            spells.remove(spellName);
                        } else {
                            System.out.println(heroName + " doesn't know " + spellName + ".");
                        }
                    } else {
                        System.out.println(heroName + " doesn't exist.");
                    }
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println("Heroes:");
        heroes
                .entrySet()
                .stream()
                .sorted((h1, h2) -> h1.getKey().compareTo(h2.getKey()))
                .forEach(h -> {
                    System.out.print("== " + h.getKey() + ": ");
                    ArrayList<String> spells = h.getValue();
                    if (spells.isEmpty()) {
                        System.out.println();
                    } else {
                        System.out.println(String.join(", ", spells));
                    }
                });
    }
}