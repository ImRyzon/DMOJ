import java.util.*;
import java.io.*;
public class FarthestHiking {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int m = readInt(), n = readInt(), u = readInt(), f = readInt(), d = readInt(), min = 0, returnMin = 0;
        String[] path = readLine().split("");

        for (int i = 0; i < path.length; i++) {
            if (path[i].equals("u")) {
                if (min + u + returnMin + d > m) {
                    System.out.println(i);
                    break;
                }

                min += u; returnMin += d;
            } else if (path[i].equals("d")) {
                if (min + d + returnMin + u > m) {
                    System.out.println(i);
                    break;
                }

                min += d; returnMin += u;
            } else {
                if (min + returnMin + (f*2) > m) {
                    System.out.println(i);
                    break;
                }

                min += f; returnMin += f;
            }

            if (i == path.length-1) {
                System.out.println(i+1);
                break;
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