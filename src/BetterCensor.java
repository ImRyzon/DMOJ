import java.util.*;
import java.io.*;
public class BetterCensor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String line = br.readLine().replaceAll("\\b\\w{4}\\b", "****");
            System.out.println(line);
        }
    }
}
