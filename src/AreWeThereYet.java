//Link: https://dmoj.ca/problem/ccc18j3

import java.io.*;
import java.util.*;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cities = new int[5];
        cities[0] = 0;
        String line = sc.nextLine();
        String[] getcities = line.split(" ");

        for (int i = 1; i < 5; i++) {
            cities[i] = Integer.parseInt(getcities[i-1]);
        }

        int[] distances = new int[5];
        int sum = 0;

    }
}