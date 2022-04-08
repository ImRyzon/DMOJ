import java.io.*;
import java.util.*;
import java.lang.*;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqrtroot = num/2;
        double t;
        do {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        } while((t - sqrtroot) != 0);
        int integer = (int) sqrtroot;
        System.out.println("The largest square has side length " + integer);

    }
}