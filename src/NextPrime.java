import java.util.*;
public class NextPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean checker = false;

        while(!checker) {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    checker = true;
                    break;
                }
                if (!checker) {
                    System.out.println(N);
                    break;
                }
                N++;
            }
        }
        sc.close();
    }
    
}
