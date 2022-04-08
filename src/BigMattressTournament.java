import java.util.*;
import java.io.*;
public class BigMattressTournament {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int T =readInt();

        for (int i = 0; i < T; i++) {
            int a = readInt(), b = readInt(), c = readInt();

            if  (b % 2 == 0) {
                if (a >= c && (a - c) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (c >= 1) {
                    c--; a--;
                    if (a >= c && (a - c) % 2 == 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (a >= 2 && a % 2 == 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
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