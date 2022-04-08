import java.util.*;
import java.io.*;
public class Luggage {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int n = readInt(), k = readInt();
        Integer[] heights = new Integer[n];

        for (int i = 0; i < n; i++) {
            heights[i] = readInt();
        }
        Arrays.sort(heights);

        System.out.println(kadanes(heights, k));
    }

    static int kadanes (Integer[] ar, int k) {
        int maxCur = ar[0], maxGlobal = ar[0], amount = 0;
        for (int i = 1; i <= ar.length-1; i++) {

            maxCur = Math.max(ar[i], maxCur + ar[i]);
            if (maxCur > maxGlobal) maxGlobal = maxCur;
        }
        return maxGlobal;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
