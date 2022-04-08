import java.util.*;
import java.io.*;
public class ANoisyClass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, m;
    static List<Integer> adj[];
    static int count[];
    static int output;
    static PriorityQueue<Integer> q = new PriorityQueue<Integer>();

    public static void main(String[] args) throws IOException {

        n = readInt(); m = readInt();

        adj = new ArrayList[n+1];
        count = new int[n+1];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int u = readInt(); int v = readInt();
            adj[u].add(v);
            count[v]++;
        }

        sort(1);
        if (output < n) {
            System.out.println("N");
        } else {
            System.out.println("Y");
        }
    }

    static void sort(int u) {
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                q.add(i);
                output++;
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int nxt : adj[cur]) {
                count[nxt]--;
                if (count[nxt] == 0) {
                    q.add(nxt);
                    output++;
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