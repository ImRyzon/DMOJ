import java.util.*;
import java.io.*;
public class JaydenStudiesTrees2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, node, maxDis;
    static int[] dis;
    static List<Integer> adj[];
    static boolean vis[];
    static PriorityQueue<Integer> q = new PriorityQueue<Integer>();

    public static void main(String[] args) throws IOException {
        n = readInt();
        adj = new ArrayList[n + 1];
        vis = new boolean[n + 1];
        dis = new int[n+1];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = readInt();
            int v = readInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1);
        Arrays.fill(vis, false);
        dfs(node);

        for (int i = 0; i < dis.length; i++) {
            if (dis[i] > maxDis) {
                maxDis = dis[i];
            }
        }

        System.out.println(maxDis);
    }

    static void dfs(int u) {
        q.add(u);
        vis[u] = true;
        dis[u] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int nxt : adj[cur]) {
                if (!vis[nxt]) {
                    q.add(nxt);
                    node = nxt;
                    vis[nxt] = true;
                    dis[nxt] = dis[cur] + 1;
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