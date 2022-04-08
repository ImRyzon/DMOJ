import java.util.*;
import java.io.*;
public class DivisibilityBy11 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n = readInt();

        for (int i = 0; i < n; i++) {

            String s = readLine();
            StringBuilder sb = new StringBuilder(s);
            System.out.println(sb);

            while (sb.length() != 2) {
                int digit = Integer.parseInt(String.valueOf(sb.charAt(sb.length()-1)));
                sb.deleteCharAt(sb.length()-1);
                int sub;
                if (sb.length() != 2) {
                    sub = Integer.parseInt(sb.substring(sb.length()-3, sb.length()));
                    sub -= digit;
                    sb.replace(sb.length()-3, sb.length(), String.valueOf(sub));
                } else {
                    sub = Integer.parseInt(sb.substring(0, sb.length()));
                    sub -= digit;
                    sb.replace(sb.length()-2, sb.length(), String.valueOf(sub));
                }

                System.out.println(sb);
            }

            if (Integer.parseInt(sb.toString()) == 11) {
                System.out.println("The number " + s + " is divisible by 11.");
            } else {
                System.out.println("The number " + s + " is not divisible by 11.");
            }
            System.out.println("");
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