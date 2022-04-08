import java.io.*;
import java.util.*;
public class ComputerPurchase {
    static FastIO r = new FastIO();
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws Exception {
        int n = r.readInt();
        try {
            String line;
            String[] array;
            String[] names = new String[n];
            int[] values = new int[n];
            int parse;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                line = r.readLine();
                array = line.split(" ");
                names[i] = array[0];
                parse = Integer.parseInt(array[1]);
                sum += (parse*2);
                parse = Integer.parseInt(array[2]);
                sum += (parse*3);
                parse = Integer.parseInt(array[3]);
                sum += parse;
                values[i] = sum;
                sum = 0;
            }

            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (values[j] < values[j+1]) {
                        int tempInt = values[j];
                        values[j] = values[j+1];
                        values[j+1] = tempInt;
                        String tempStr = names[j];
                        names[j] = names[j+1];
                        names[j+1] = tempStr;
                    }
                }
            }

            if (n == 1) {
                System.out.println(names[0]);
            } else if (values[0] > values[1]) {
                System.out.println(names[0]);
                System.out.println(names[1]);
            } else if (values[0] == values[1]) {
                int compare = names[0].compareTo(names[1]);
                if (compare < 0) {
                    System.out.println(names[0]);
                    System.out.println(names[1]);
                } else if (compare > 0) {
                    System.out.println(names[1]);
                    System.out.println(names[0]);
                }
            }

        } catch (Exception e) {
            System.out.println("");
        }

    }

    static class FastIO extends PrintWriter {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar, numChars;
        public FastIO() { this(System.in, System.out); }
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