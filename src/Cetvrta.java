import java.util.*;
import java.io.*;
public class Cetvrta {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        String rect[][] = new String[3][2], output = "";

        for (int i = 0; i < 3 ; i++) {
            rect[i] = readLine().split(" ");
        }

        if (!(rect[0][0].equals(rect[1][0])) && !(rect[0][0].equals(rect[2][0]))) {
            output += rect[0][0];
        } else if (!(rect[1][0].equals(rect[0][0]))) {
            output += rect[1][0];
        } else {
            output += rect[2][0];
        }
        output += " ";

        if (!(rect[0][1].equals(rect[1][1])) && !(rect[0][1].equals(rect[2][1]))) {
            output += rect[0][1];
        } else if (!(rect[1][1].equals(rect[0][1]))) {
            output += rect[1][1];
        } else {
            output += rect[2][1];
        }

        System.out.println(output);
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