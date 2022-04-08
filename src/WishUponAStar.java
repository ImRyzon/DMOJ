import java.util.*;
import java.io.*;
public class WishUponAStar {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static Map<Integer, Integer> parent = new HashMap<>();
    static Map<Integer, Integer> rank = new HashMap<>();

    public static void main(String[] args) throws IOException {

        int n = readInt(), m = readInt();
        int[] dsu = new int[n];

        for (int i = 0; i < dsu.length; i++) {
            dsu[i] = i + 1;
        }

        makeSet(dsu);
        int counter = 0;

        for (int i = 0; i < m; i++) {
            int a = readInt(), b = readInt();
            setUnion(a, b);
        }

    }

    static void makeSet(int[] dsu) {
        for (int i : dsu) {
            parent.put(i, i);
            rank.put(i, 0);
        }
    }

    static int findSet(int k) {
        if (parent.get(k) != k) {
            parent.put(k, findSet(parent.get(k)));
        }
        return parent.get(k);
    }

    static void setUnion(int a, int b) {
        int x = findSet(a), y = findSet(b);

        if (x == y) {
            return;
        }

        if (rank.get(x) > rank.get(y)) {
            parent.put(y, x);
        } else if (rank.get(x) < rank.get(y)) {
            parent.put(x, y);
        } else {
            parent.put(x, y);
            rank.put(y, rank.get(y) + 1);
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