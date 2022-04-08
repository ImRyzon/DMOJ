import java.io.*;
import java.util.*;

public class Palindromes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        for (int i = 0; i < n; i++) {
            String s = readLine(); int max = 1, st = 0, length = s.length(), low, high;
            for (int j = 1; j < length; ++j) {
                low = j-1; high = j;
                while (low >= 0 && length > high && s.charAt(low) == s.charAt(high)) {++high; --low;}
                ++low; --high;
                if (s.charAt(low) == s.charAt(high) && high-low+1 > max) {st = low; max = high-low+1;}
                low = j-1; high = j+1;
                while (low >= 0 && length > high && s.charAt(low) == s.charAt(high)) {++high; --low;}
                ++low; --high;
                if (s.charAt(low) == s.charAt(high) && high-low+1 > max) {st = low; max = high-low+1;}
            }
            System.out.println(s.substring(st, st+max));
            System.out.println(s.substring(st, st+max).length());
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