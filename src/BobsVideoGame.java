import java.io.*;
import java.util.*;
public class BobsVideoGame {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws Exception {
        int n = r.readInt(), m = r.readInt(), t = r.readInt();
        int adj[][] = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) Arrays.fill(adj[i], (int)1e9);
        for (int i = 1; i <= m; i++) {
            int u = r.readInt(), v = r.readInt(), w = r.readInt();
            adj[u][v] = w;
        }
        for (int k =1; k <= n; k++) {
            for (int s = 1; s <= n; s++) {
                for (int d = 1; d <= n; d++) {
                    adj[s][d] = Math.min(adj[s][d], Math.max(adj[s][k], adj[k][d]));
                }
            }
        }
        while (t --> 0) {
            int u = r.readInt(), v = r.readInt();
            pr.println(adj[u][v] == (int)1e9 ? -1 : adj[u][v]);
        }
        pr.close();
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