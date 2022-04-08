import java.util.*;
import java.io.*;
public class BobsHistogram {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int N = readInt();
        String[] s = readLine().split(" ");
        Integer[] nums = new Integer[N];
        double sum = 0.0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(s[i]);
            sum += nums[i];
        }
        sum /= N;
        int sumInt = (int) sum;
        if (sum - sumInt >= 0.5) {
            sumInt += 1;
        }
        for (int i = 0; i < N; i++) {
            total += (nums[i] - sumInt)*(nums[i] - sumInt);
        }
        System.out.println(total);
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}