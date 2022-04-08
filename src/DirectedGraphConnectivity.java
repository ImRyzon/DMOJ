import java.io.*;
import java.util.*;
public class DirectedGraphConnectivity {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int n, m;
    static boolean adj[][];

    public static void main(String[] args) throws IOException {
        n = r.readInt(); m = r.readInt();
        int[] u = new int[m];
        int[] v = new int[m];
        adj = new boolean[n+1][n+1];
        for (int i = 0; i < m; i++) {
            u[i] = r.readInt(); v[i] = r.readInt();
            adj[u[i]][v[i]] = true;

        }
        for (int i = 0; i < m; i++) {
            adj[u[i]][v[i]] = false;
            if (bfs(1, n)) {
                pr.println("YES");
            } else {
                pr.println("NO");
            }
            adj[u[i]][v[i]] = true; pr.flush();
        }
    }

    static boolean bfs (int st, int ed) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n+1];
        q.add(st);
        vis[st] = true;
        while(!q.isEmpty()) {
            int u = q.poll();
            for (int v = 1; v <= n; v++) {
                if (adj[u][v] && !vis[v]) {
                    q.add(v);
                    vis[v] = true;
                }
            }
        }
        return vis[ed];
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