import java.util.*;
import java.io.*;
public class Waterpark {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static List<Integer> adj[];

    public static void main(String[] args) throws IOException {

        int n = readInt(), u = readInt(), v = readInt();
        adj = new ArrayList[n];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        while (u != 0 || v != 0) {
            adj[u].add(v);
            adj[v].add(u);
            u = readInt(); v = readInt();
        }
    }

    static void dfs (int u) {

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