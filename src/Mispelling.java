import java.io.*;
import java.util.*;
public class Mispelling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= N; i++) {
            String line = sc.nextLine();
            String[] array = line.split(" ");
            int num = Integer.parseInt(array[0]);
            line = line.replaceAll("\\d", "");
            StringBuilder sb = new StringBuilder(line);
            sb = sb.deleteCharAt(num);
            System.out.println(i + "" + sb);
        }
    }
}
