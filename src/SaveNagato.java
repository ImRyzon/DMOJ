import java.io.*;
import java.util.*;
public class SaveNagato {
	static FastIO r = new FastIO();
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int n, far, len, dis1[], dis2[]; static List<Integer> adj[];
	public static void main(String[] args) throws IOException{
		n = r.readInt(); adj = new ArrayList[n+1];
		dis1 = new int[n+1]; dis2 = new int[n+1];
		for(int i=0; i<=n; i++) adj[i] = new ArrayList<>();
		for(int i=1; i< n; i++) {
			int u = r.readInt(), v = r.readInt();
			adj[u].add(v);  adj[v].add(u);
		}
		bfs(1, dis1);
		Arrays.fill(dis1, 0);
		bfs(far, dis1);
		bfs(far, dis2);
		for(int i=1; i<=n; i++) pr.println(Math.max(dis1[i], dis2[i]));
		pr.flush();
	}
	static void bfs(int s, int dis[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		dis[s] = 1;
		while (!q.isEmpty()) {
			int cur = q.poll();
			far = cur;
			for (int nxt : adj[cur]) {
				if (dis[nxt] == 0) {
					q.add(nxt);
					dis[nxt] = dis[cur] + 1;
				}
			}
		}
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