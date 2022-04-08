import java.util.*;
import java.io.*;
public class JamesSolvesTree {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static List<Integer> adj[];

    public static void main(String[] args) throws Exception {

        int q = readInt(), oldRootA = 0, length = 1;
        adj = new ArrayList[2*q+1];
        List<Integer> alr = new ArrayList<>();
        boolean isValid = true;

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < q; i++) {
            String operation = next(); int a = readInt(), b = readInt();
            if (alr.contains(a) && alr.contains(b)) {
                isValid = false;
                break;
            }

            adj[a].add(b);
            adj[b].add(a);
            length++;

            if (i == 0) {
                oldRootA = a;
            } else {
                if (!alr.contains(a) && !alr.contains(b)) {
                    adj[a].add(oldRootA);
                    adj[oldRootA].add(a);
                    length++;
                }
            }

            if (!alr.contains(a)) alr.add(a);
            if (!alr.contains(b)) alr.add(b);
        }

        if (!isValid) {
            System.out.println(-1);
        } else {
            System.out.println(length);
            for (int u = 1; u < length+1; u++) {
                for (int v : adj[u]) {
                    if (u < v) {
                        System.out.println(u + " " + v);
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