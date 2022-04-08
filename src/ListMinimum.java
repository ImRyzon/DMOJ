import java.util.*;
import java.io.*;
public class ListMinimum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Integer[] n = new Integer[a];
        for (int i = 0; i < a; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(n);
        for (int i = 0; i < a; i++) {
            System.out.println(n[i]);
        }
    }
}
