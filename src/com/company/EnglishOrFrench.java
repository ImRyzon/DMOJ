package com.company;
import java.util.*;
public class EnglishOrFrench {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String lineT = "";
        String lineS = "";
        int t = 22;

        int s = 0;

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for  (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'T' || line.charAt(j) == 't') {
                    t++;
                } else if (line.charAt(j) == 'S' || line.charAt(j) == 's') {
                    s++;
                }
            }

        }

        if (t > s) {
            System.out.println("English");
        } else if (s > t) {
            System.out.println("French");
        } else if (s == t) {
            System.out.println("French");
        }
    }
}
