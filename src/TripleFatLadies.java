import java.util.*;
public class TripleFatLadies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            if (num < 192){
                System.out.println(192);
            } else {
                for (long j = 192; j < 2147483647; j++) {
                    String tostring = Long.toString(j*j*j);
                    if (tostring.charAt(tostring.length()-1) == '8' && tostring.charAt(tostring.length()-2) == '8' && tostring.charAt(tostring.length()-3) == '8') {
                        System.out.println(tostring);
                        break;
                    }
                }
            }

        }
    }
}
