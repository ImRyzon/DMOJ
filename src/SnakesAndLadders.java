import java.io.*;
import java.util.*;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scan = 0;
        int square = 1;
        do {
            scan = sc.nextInt();
            if (scan == 0) {
                System.out.println("You Quit!");
                break;
            } else {
                square += scan;
                if (square == 54) {
                    square = 19;
                } else if (square == 90) {
                    square = 48;
                } else if (square == 99) {
                    square = 77;
                } else if (square == 9) {
                    square = 34;
                } else if (square == 40) {
                    square = 64;
                } else if (square == 67) {
                    square = 86;
                } else if (square == 100) {
                    System.out.println("You are now on square " + square);
                    System.out.println("You Win!");
                    break;
                } else if (square > 100) {
                    square -= scan;
                }
                System.out.println("You are now on square " + square);
            }
        } while (scan != 0);
    }
}
