import java.io.*;
import java.util.*;

public class CyclicShifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        String S = sc.nextLine();
        String[] sArray = S.split("");
        String tostring = "";
        int index = 0;
        boolean isCyclic = false;
        for (int i = 0; i < S.length(); i++) {
            if (i >= 1) {
                for (int j = 0; j < S.length()-1; j++) {
                    String temp = sArray[j];
                    sArray[j] = sArray[j+1];
                    sArray[j+1] = temp;
                }
            }
            tostring = Arrays.toString(sArray).replaceAll("[^a-zA-Z]", "");
            index = T.indexOf(tostring);
            if (index != -1) {
                isCyclic = true;
                break;
            }
        }

        if (isCyclic == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}