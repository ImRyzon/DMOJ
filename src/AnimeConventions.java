import java.io.*;
import java.util.*;
public class AnimeConventions {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Map<Integer, Integer> parent = new HashMap<>();
    static Map<Integer, Integer> rank = new HashMap<>();

    public static void main(String[] args) throws IOException {

        int n = r.readInt(), q = r.readInt();
        int[] universe = new int[n];

        for (int i = 0; i < n; i++) {
            universe[i] = i + 1;
        }

        makeSet(universe);

        for (int i = 0; i < q; i++) {
            String query = r.next(); int x = r.readInt(), y = r.readInt();
            if (query.equals("A")) {
                setUnion(x, y);
            } else {
                if (findSet(x) == findSet(y)) {
                    pr.println("Y");
                } else {
                    pr.println("N");
                }
            }
        }

        pr.flush();
    }

    static void makeSet(int[] universe) {
        for (int i : universe) {
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