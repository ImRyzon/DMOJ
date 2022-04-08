import java.util.*;
import java.io.*;
public class DeathGun {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int m;
    static List<Integer> adj[];
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<String> output = new ArrayList<String>();
    static PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    static int count[];

    public static void main(String[] args) throws IOException {

        m = readInt();
        adj = new ArrayList[m*2+1];
        count = new int[m*2+1];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            String name1 = next(); String name2 = next();
            boolean b1;
            boolean b2;
            if (i == 0) {
                b1 = false; b2 = false;
            } else {
                b1 = names.contains(name1);
                b2 = names.contains(name2);
            }
            if (!b1 && !b2) {
                names.add(name1);
                names.add(name2);
            } else if (!b1 && b2) {
                names.add(name1);
            } else if (b1 && !b2) {
                names.add(name2);
            }
            adj[names.indexOf(name2)].add(names.indexOf(name1));
            count[names.indexOf(name1)]++;
        }

        topoSort(1);
        for (int i = 0; i < output.size(); i++) {
                System.out.println(output.get(i));
        }
    }

    static void topoSort (int u) {
        for (int i = 0; i < names.size(); i++) {
            if (count[i] == 0) {
                q.add(i);
                output.add(names.get(i));
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int nxt : adj[cur]) {
                count[nxt]--;
                if (count[nxt] == 0) {
                    q.add(nxt);
                    output.add(names.get(nxt));
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