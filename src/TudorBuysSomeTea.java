import java.io.*;
import java.util.*;

public class TudorBuysSomeTea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split(" ");
        int[] arrayInt = new int[2];
        for (int i = 0; i < 2; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
        int integer = arrayInt[1];
        int plusOne = integer + 1;
        int modulus = arrayInt[0] % arrayInt[1];
        int divide = arrayInt[0]/plusOne;
        System.out.println((divide*arrayInt[1]) + modulus);
    }
}