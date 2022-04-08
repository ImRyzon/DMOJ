import java.util.*;
import java.io.*;
public class CullingForFish {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int m = readInt(), n = readInt();
        Integer[][] grid = new Integer[m][n];
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = readInt();
            }
        }
        sum += (m*n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                sum += Math.abs(grid[i][j] - grid[i][j+1]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m-1; j++) {
                sum += Math.abs(grid[j][i] - grid[j+1][i]);
            }
        }

        System.out.println(sum);
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