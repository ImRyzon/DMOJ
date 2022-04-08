import java.util.*;
import java.io.*;
public class BerryPicking {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, k;
    static int berries[] = new int[1001];

    public static void main(String[] args) throws IOException {

        n = readInt(); k = readInt();
        int maxBerry = 0;

        for (int i = 0; i < n; i++) {
            berries[i] = readInt();
            maxBerry = Math.max(maxBerry, berries[i]);
        }
        int maxtot = 0;
        for (int q = 1; q <= maxBerry; q++) {
            int chunks[] = new int[1001];
            for (int i = 0; i <= q; i++) {
                chunks[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                chunks[q] += berries[i]/q;
                chunks[berries[i] % q]++;
            }
            if (k/2 > chunks[q]) {
                continue;
            }
            chunks[q] -= k/2;
            int given = 0;
            int curr = q;
            int total = 0;
            while(curr > 0 && given < k/2) {
                if (chunks[curr] > 0) {
                    given++;
                    total += curr;
                    chunks[curr]--;
                } else {
                    curr--;
                }
            }
            if (given == k/2) {
                maxtot = Math.max(maxtot, total);
            }
        }
        System.out.println(maxtot);
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