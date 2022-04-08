import java.util.*;
public class WhoHasSeenTheWind {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        boolean canLand = false;
        for (int i = 0; i < M; i++) {
            int A = -6*i*i*i*i + H*i*i*i + 2*i*i + i;
            if (A <= 0) {
                canLand = true;
                System.out.println("The balloon first touches ground at hour\n" + i);
                break;
            }
        }
        if (canLand = false) {
            System.out.println("The balloon does not touch ground in the given time.");
        }
        sc.close();
    }
}
