import java.io.*;
import java.util.*;
public class ArrangingBooks{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Reader r = new Reader();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder(r.readLine());
        int counter = 0;
        boolean LS = false;
        boolean MS = false;
        boolean LM = false;

        while (!LM) {
            int index1;
            int index2;
            if (!LS) {
                index1 = sb.lastIndexOf("L");
                index2 = sb.indexOf("S");
                if (index1 > index2 && index1 != -1 && index2 != -1) {
                    sb.setCharAt(index1, 'S');
                    sb.setCharAt(index2, 'L');
                    counter++;
                } else {
                    LS = true;
                }
            } else if (!MS) {
                index1 = sb.lastIndexOf("M");
                index2 = sb.indexOf("S");
                if (index1 > index2 && index1 != -1 && index2 != -1) {
                    sb.setCharAt(index1, 'S');
                    sb.setCharAt(index2, 'M');
                    counter++;
                } else {
                    MS = true;
                }
            } else if (!LM) {
                index1 = sb.lastIndexOf("L");
                index2 = sb.indexOf("M");
                if (index1 > index2 && index1 != -1 && index2 != -1) {
                    sb.setCharAt(index1, 'M');
                    sb.setCharAt(index2, 'L');
                    counter++;
                } else {
                    break;
                }
            }
        }

        System.out.println(counter);
    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public Reader(String file_name) throws IOException {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
        public int readInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }
        public long readLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
        public double readDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
}
