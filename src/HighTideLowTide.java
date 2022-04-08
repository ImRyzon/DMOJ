import java.util.*;
import java.io.*;
public class HighTideLowTide {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

        int N = readInt();
        int[] tides = new int[N];
        int[] outputs = new int[N];
        int average = 0;

        for (int i = 0; i < N; i++) {
            tides[i] = readInt();
            average += tides[i];
        }

        average = Math.round(average/N);
        
        for (int i = 0; i < N; i++) {
            if (tides[i] < average) {
                outputs[i] = tides[i];
            }
        }
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}