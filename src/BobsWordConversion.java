import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class BobsWordConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int counter = 0;
        if (line1.length() == line2.length()+1) {
            for (int i = 0; i < line2.length(); i++) {
                if (line1.charAt(i) != line2.charAt(i)) {
                    counter++;
                }
                if (counter > 1) {
                    break;
                }
            }
            if (counter <= 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
