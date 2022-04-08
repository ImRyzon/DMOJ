import java.util.Arrays;
import java.util.Scanner;

public class Shoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.replaceAll("\\s+", "");

        for (int i = 0; i < 2; i++) {
            int index1 = line.indexOf("L");
            int index2 = line.indexOf("R");
            System.out.println((index1 + 1) + " " + (index2 + 1));
            line = line.replaceFirst("L", " ");
            line = line.replaceFirst("R", " ");
        }
    }
}
