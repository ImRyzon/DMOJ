import java.util.*;
import java.io.*;
public class MilkFactory {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static List<Integer> adj[];
    static boolean vis[];

    public static void main(String[] args) throws IOException {

        n = readInt();
        adj = new ArrayList[102];
        vis = new boolean[102];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n-1; i++) {
            int a = readInt(), b = readInt();
            adj[b].add(a);
        }

        int ans = -1;

        for (int start = 1; start <= n; start++) {
            for (int i = 0; i < 101; i++) {
                vis[i] = false;
            }
            dfs(start);
            boolean done = true;
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    done = false;
                }
            }
            if (done) {
                ans = start;
                break;
            }
        }

        System.out.println(ans);
    }

    static void dfs(int node) {
        vis[node] = true;
        for (int u: adj[node]) {
            if(!vis[u]) {
                dfs(u);
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