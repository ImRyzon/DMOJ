import java.io.*;
import java.util.*;
public class FourNationsOneSecret {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws Exception {
        int n = r.readInt(); String s = r.readLine(); int max = 1, st = 0, length = s.length(), low, high;
        for (int j = 1; j < length; ++j) {
            low = j-1; high = j;
            while (low >= 0 && length > high && s.charAt(low) == s.charAt(high)) {++high; --low;}
            ++low; --high;
            if (s.charAt(low) == s.charAt(high) && high-low+1 > max) {st = low; max = high-low+1;}
            low = j-1; high = j+1;
            while (low >= 0 && length > high && s.charAt(low) == s.charAt(high)) {++high; --low;}
            ++low; --high;
            if (s.charAt(low) == s.charAt(high) && high-low+1 > max) {st = low; max = high-low+1;}
        }
        pr.println(s.substring(st, st+max));
        pr.println(s.substring(st, st+max).length());
        pr.close();
    }

    static class FastIO extends PrintWriter {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar, numChars;
        public FastIO() { this(System.in, System.out); }
        public FastIO(InputStream i, OutputStream o) {super(o);stream = i;}
        public FastIO(String i, String o) throws IOException {
            super(new FileWriter(o));stream = new FileInputStream(i);
        }
        private int readByte() {
            if (numChars == -1) {throw new InputMismatchException();}
            if (curChar >= numChars) {
                curChar = 0;
                try {numChars = stream.read(buf);}catch(Exception e){throw new InputMismatchException();}
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