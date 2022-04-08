import java.util.*;
import java.io.*;
public class MaximumSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int n = readInt(); Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) arr[i] = readLong();
        System.out.println(maxSum(arr));
    }

    static long maxSum(Long[] array) {
        long in = array[0], ex = 0, exNew;
        for (int i = 1; i < array.length; i++) {exNew = Math.max(in, ex); in = ex + array[i]; ex = exNew;}
        return Math.max(in, ex);
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