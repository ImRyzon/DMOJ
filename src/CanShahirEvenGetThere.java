import java.io.*;
import java.util.*;
public class CanShahirEvenGetThere {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int n, m, a, b, u , v;
    static boolean adj[][];
    static boolean visited[];


    public static void main(String[] args) throws IOException {

        n = r.readInt(); m = r.readInt(); a = r.readInt(); b = r.readInt();
        adj = new boolean[2020][2020];
        visited = new boolean[2020];

        for (int i = 0; i < m; i++) {
            u = r.readInt(); v = r.readInt();
            adj[u][v] = true;
            adj[v][u] = true;

        }

        dfs(a);
        if (visited[b]) {
            pr.println("GO SHAHIR!");
        } else {
            pr.println("NO SHAHIR!");
        }
        pr.flush();
    }

    static void dfs (int i) {

        visited[i] = true;

        for (int j = 1; j <= m; j++) {
            if (adj[i][j] && !visited[j]) {
                dfs(j);
            }
        }

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