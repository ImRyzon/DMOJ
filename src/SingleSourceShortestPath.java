import java.io.*;
import java.util.*;
public class SingleSourceShortestPath {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws Exception {
        int n = r.readInt(), m = r.readInt(), dis[] = new int[n+1];
        List<Edge> adj[] = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = r.readInt(), v = r.readInt(), w = r.readInt();
            adj[u].add(new Edge(v, w));
            adj[v].add(new Edge(u, w));
        }
        dijkstra(1, adj, dis);
        for (int i = 1; i < dis.length; i++) {
            pr.println(dis[i] == Integer.MAX_VALUE ? -1 : dis[i]);
        }
        pr.close();
    }

    static void dijkstra (int start, List<Edge> adj[], int dis[]) {
        Arrays.fill(dis, Integer.MAX_VALUE); dis[start] = 0;
        PriorityQueue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(start, dis[start]));
        while(!q.isEmpty()) {
            int u = q.peek().v; long d = q.peek().w; q.poll();
            if(d > dis[u]) continue;
            for(Edge e : adj[u]) {
                if(dis[e.v] > dis[u] + e.w) {
                    dis[e.v] = dis[u] + e.w; q.add(new Edge(e.v, dis[e.v]));
                }
            }
        }
    }

    static class Edge implements Comparable <Edge> {
        int v, w;
        public Edge(int v, int w) {this.v = v; this.w = w;}
        public int compareTo(Edge e) { return w - e.w; }
    }

    static class FastIO extends PrintWriter {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar, numChars;
        public FastIO() {this(System.in, System.out);}
        public FastIO(InputStream i, OutputStream o) {super(o);stream = i;}
        public FastIO(String i, String o) throws IOException {
            super(new FileWriter(o)); stream = new FileInputStream(i);
        }
        private int readByte() {
            if (numChars == -1) {throw new InputMismatchException();}
            if (curChar >= numChars) {
                curChar = 0;
                try {numChars = stream.read(buf);
                }catch(Exception e){throw new InputMismatchException();}
                if (numChars == -1) {return -1;}
            }
            return buf[curChar++];
        }
        public String next() {
            int c; do {c = readByte();} while (c <= ' ');
            StringBuilder res = new StringBuilder();
            do {res.appendCodePoint(c);c = readByte();} while (c > ' ');
            return res.toString();
        }
        public String readLine() {
            int c; do {c = readByte();} while (isEndLine(c));
            StringBuilder res = new StringBuilder();
            do {res.appendCodePoint(c);c = readByte();} while (c >= ' ');
            return res.toString();
        }
        public int readInt() {
            int c, sgn = 1, res = 0;
            do {c = readByte();} while (c <= ' ');
            if (c == '-') {sgn = -1;c = readByte();}
            do {
                if (c < '0' || c > '9') {throw new InputMismatchException();}
                res = 10 * res + c - '0';c = readByte();
            } while (c > ' ');
            return res * sgn;
        }
        public double readDouble() {return Double.parseDouble(next());}
        public long readLong() {return Long.parseLong(next());}
        boolean isEndLine(int c) {return c == '\n' || c == '\r' || c == -1;}
    }
}