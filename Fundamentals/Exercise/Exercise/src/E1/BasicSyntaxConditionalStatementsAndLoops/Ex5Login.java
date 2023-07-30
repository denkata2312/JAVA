package E1.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Ex5Login {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String user = read.nextLine();
        String pass = read.nextLine();
        StringBuilder sb = new StringBuilder(user);
        String reversedUser = sb.reverse().toString();
        int counter = 0;
        while(true) {
            if(!pass.equals(reversedUser)) {
                counter++;
                if(counter == 4) {
                    System.out.println("User " + user + " blocked!");
                    return ;
                }
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.println("User " + user + " logged in.");
                break;
            }
            pass = read.nextLine();
        }

    }
}