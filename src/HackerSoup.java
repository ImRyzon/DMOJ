import java.util.*;
import java.io.*;
public class HackerSoup {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int n = readInt(), k = readInt(), q = readInt();
        Integer[][] grid = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = i*n+j+1;
            }
        }

        System.out.println(Arrays.deepToString(grid));

        for (int i = 0; i < k; i++) {
            int t = readInt()-1, l = readInt()-1, b = readInt()-1, r = readInt()-1, size = b-t+1;

            for (int x = 0; x < size; x++) {
                for (int y = x; y < size; y++) {
                    int temp = grid[x+t][y+l];
                    grid[x+t][y+l] = grid[y+l][x+t];
                    grid[y+l][x+t] = temp;
                }
            }

            for (int x = 0; x < size; x++) {
                for (int y = 0; y < (size/2); y++) {
                    int temp = grid[x+t][y+l];
                    grid[x+t][y+l] = grid[x+t][b-y];
                    grid[x+t][b-y] = temp;
                }
            }

            System.out.println(Arrays.deepToString(grid));
        }

        for (int i = 0; i < q; i++) {
            int r = readInt()-1, c = readInt()-1;
            System.out.println(grid[r][c]);
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