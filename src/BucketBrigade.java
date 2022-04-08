import java.util.*;
import java.io.*;
public class BucketBrigade {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int cowsNum = 0;
        int[] barn = new int[2];
        int[] lake = new int[2];
        int[] rock = new int[2];

        for (int i = 0; i < 10; i++) {

            String[] line = readLine().split("");
            int indexBarn = Arrays.asList(line).indexOf("B");
            int indexLake = Arrays.asList(line).indexOf("L");
            int indexRock = Arrays.asList(line).indexOf("R");

            if (indexBarn != -1) {
                barn[0] = indexBarn;
                barn[1] = i;
            }

            if (indexLake != -1) {
                lake[0] = indexLake;
                lake[1] = i;
            }

            if (indexRock != -1) {
                rock[0] = indexRock;
                rock[1] = i;
            }
        }

        if (barn[0] == lake[0] && rock[0] == lake[0] && ((rock[1] > barn[1] && rock[1] < lake[1]) || (rock[1] < barn[1] && rock[1] > lake[1]))) {
            cowsNum = Math.abs(lake[1] - barn[1]) + 1;
        } else if (barn[1] == lake[1] && rock[1] == lake[1] && ((rock[0] > barn[0] && rock[0] < lake[0]) || (rock[0] < barn[0] && rock[0] > lake[0]))) {
            cowsNum = Math.abs(lake[0] - barn[0]) + 1;
        } else {
            cowsNum = Math.abs(lake[1] - barn[1]) + Math.abs(lake[0] - barn[0]) - 1;
        }
        System.out.println(cowsNum);
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