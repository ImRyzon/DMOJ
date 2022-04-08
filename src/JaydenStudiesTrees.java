import java.io.*;
import java.util.*;
public class JaydenStudiesTrees {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Reader r = new Reader();
    static StringTokenizer st;
    static int n;
    static int len = 0;
    static int far = 0;
    static List<Integer> adj[];

    public static void main(String[] args) throws IOException {
        n = r.readInt();
        adj = new ArrayList[n+1];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n-1; i++){
            int u = r.readInt();
            int v = r.readInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1, -1, 0);
        dfs(far, -1, 0);
        pr.println(len); pr.flush();
    }

    static void dfs(int cur, int last, int d) {
        if (d > len) {
            len = d;
            far = cur;
        }

        for (int x : adj[cur]) {
            if (x != last) {
                dfs(x, cur, d + 1);
            }
        }
    }

    static class Reader {
        private int BUFFER_SIZE = 1 << 16, bufferPointer, bytesRead;
        private DataInputStream din; private byte[] buffer;
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE]; bufferPointer = bytesRead = 0;
        }
        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE]; bufferPointer = bytesRead = 0;
        }
        public String readLine() throws IOException {
            byte[] buf = new byte[64]; int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {if (cnt != 0) break; else continue;}
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
        public int readInt() throws IOException {
            int ret = 0; byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-'); if (neg) c = read();
            do {ret = ret * 10 + c - '0';} while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret; return ret;
        }
        public long readLong() throws IOException {
            long ret = 0; byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {ret = ret * 10 + c - '0';} while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret; return ret;
        }
        public double readDouble() throws IOException {
            double ret = 0, div = 1; byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');if (neg) c = read();
            do {ret = ret * 10 + c - '0';} while ((c = read()) >= '0' && c <= '9');
            if (c == '.') {while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);}
            if (neg) return -ret; return ret;
        }
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) buffer[0] = -1;
        }
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer(); return buffer[bufferPointer++];
        }
        public void close() throws IOException {if (din == null) return;din.close();}
    }
    static long readLong () throws IOException {return Long.parseLong(next());}
    static int readInt () throws IOException {return Integer.parseInt(next());}
    static double readDouble () throws IOException {return Double.parseDouble(next());}
    static char readCharacter () throws IOException {return next().charAt(0);}
    static String readLine () throws IOException {return br.readLine().trim();}
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}