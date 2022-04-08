import java.util.Scanner;

public class RotatingLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = line;
        line = line.replaceAll("[^IOSHZXN]", "");
        if (line == line2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
