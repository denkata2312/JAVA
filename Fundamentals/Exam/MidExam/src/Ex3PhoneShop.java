import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneList = new ArrayList<>();
        String[] initialPhones = scanner.nextLine().split(", ");
        for (String phone : initialPhones) {
            phoneList.add(phone);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            String action = commandParts[0];
            String phone = commandParts[1];

            switch (action) {
                case "Add":
                    if (!phoneList.contains(phone)) {
                        phoneList.add(phone);
                    }
                    break;
                case "Remove":
                    phoneList.remove(phone);
                    break;
                case "Bonus phone":
                    String[] bonusPhoneParts = phone.split(":");
                    String oldPhone = bonusPhoneParts[0];
                    String newPhone = bonusPhoneParts[1];
                    if (phoneList.contains(oldPhone)) {
                        int index = phoneList.indexOf(oldPhone);
                        phoneList.add(index + 1, newPhone);
                    }
                    break;
                case "Last":
                    if (phoneList.contains(phone)) {
                        phoneList.remove(phone);
                        phoneList.add(phone);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(phoneList.toString().replace("[","").replace("]",""));
    }
}