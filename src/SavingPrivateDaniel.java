import java.util.*;
import java.io.*;
public class SavingPrivateDaniel {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        Map <Integer, String> dict = new HashMap<>();
        dict.put(1, "A");
        dict.put(2, "B");
        dict.put(3, "C");
        dict.put(4, "D");
        dict.put(5, "E");

        String s = "@Enming, Private Daniel is at ";
        s += dict.get(readInt()) + " ";
        s += readInt()*2+6;
        s += " " + ((readInt() - 3)*3);
        s += " " + (readInt() + 7);
        s += " " + (readInt()-3) + "!";
        System.out.println(s);
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