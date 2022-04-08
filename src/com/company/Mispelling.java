package com.company;

import java.util.*;
public class Mispelling {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < num; i++) {

                String word = sc.next() + sc.nextLine();
                String replace = word.replaceAll("[^-?0-9]+", "");
                replace = replace.replaceAll(" ", "");
                int replaceInt = Integer.parseInt(replace);

                word = word.replaceAll("[^a-zA-Z\\s]", "");
                System.out.println(word);

                int length = word.length();
                String newWord = word.substring(1, replaceInt) + word.substring(replaceInt + 1, length);
                System.out.println((i + 1) + " "  + newWord);

            }
        }
}
