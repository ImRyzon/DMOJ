import java.io.*;
import java.util.*;

public class Preokret {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] a = new int[A];

        for (int i = 0; i < A; i++) {
            a[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        int[] b = new int[B];

        for (int i = 0; i < B; i++) {
            b[i] = sc.nextInt();
        }

        int halfCounter = 0;

        for (int i = 0; i < A; i++) {
            if (a[i] <= 1440) {
                halfCounter++;
            }
        }

        for (int i = 0; i< B; i++) {
            if (b[i] <= 1440) {
                halfCounter++;
            }
        }

        System.out.println(halfCounter);
        int turnCounter = 0;

        boolean AStartsFirst = false;


        if (a.length > b.length) {
            for (int i = 1; i < b.length; i++) {

            }
        }


    }
}