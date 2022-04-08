import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class APalindromeProblem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        String n = readLine();
        if (n.length() <= 1) {
            System.out.println("NO");
        } else {
            StringBuilder sb = new StringBuilder(n).reverse();
            if (sb.toString().equals(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
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