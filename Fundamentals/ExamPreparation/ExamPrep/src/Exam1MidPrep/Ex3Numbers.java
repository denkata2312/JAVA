import java.util.*;
import java.util.stream.Collectors;

public class Ex3Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        for (int item : numbersList) {
            sum += item;
        }

        double avgValue = sum * 1.0 / numbersList.size();

        List<Integer> resultList = new ArrayList<>();
        for (int item : numbersList) {
            if (item > avgValue) {
                resultList.add(item);
            }
        }

        Collections.sort(resultList);
        Collections.reverse(resultList);

        if (resultList.size() <= 5 && resultList.size() > 1) {
            System.out.println(resultList.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
            //System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
        } else if (resultList.isEmpty()) {
            System.out.println("No");
        } else {
            resultList = resultList.stream().limit(5).collect(Collectors.toList());
            for (int item : resultList) {
                System.out.printf("%d ", item);
            }
        }

    }
}