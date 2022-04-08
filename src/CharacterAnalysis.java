import java.util.Arrays;
import java.util.Scanner;

public class CharacterAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] array1 = line1.split("");
        String[] array2 = line2.split("");
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < line2.length(); i++) {
            if (!(array1[i].equals(array2[i]))) {
                System.out.println(array2[i]);
                break;
            }
        }
    }
}
