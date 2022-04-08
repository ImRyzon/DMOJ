import java.util.*;

public class Uncrackable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        String digitReplace = line.replaceAll("[^\\d]", "");
        String upperReplace = line.replaceAll("[^a-z]", "");
        String lowerReplace = line.replaceAll("[^A-Z]", "");

        if (line.length() >= 8 && line.length() <= 12) {
            if (digitReplace.length() != 0) {
                if (upperReplace.length() >= 3) {
                    if (lowerReplace.length() >= 2) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

    }
}
