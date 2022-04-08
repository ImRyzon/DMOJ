import java.util.*;
import java.io.*;
public class BobsTripPlan {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        List<Integer> attract = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            attract.add(readInt());
        }

        for (int i = 0; i < attract.size(); i++) {
            int total = 0;
            int rep = attract.get(i);
            attract.remove(i);
            total += Math.abs(attract.get(0));

            for (int j = 0; j < attract.size()-1; j++) {
                total += Math.abs(attract.get(j) - attract.get(j+1));
            }

            total += Math.abs(attract.get(attract.size() - 1));
            attract.add(i, rep);
            System.out.println(total);
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