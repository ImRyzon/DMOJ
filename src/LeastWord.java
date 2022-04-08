import java.util.*;
import java.io.*;
public class LeastWord {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        List<String> words = new ArrayList<>(), reverse = new ArrayList<>();
        int n = readInt(), l = readInt();
        String output = "";
        StringBuilder sb;

        for (int i = 0; i < n; i++) {
            sb = new StringBuilder(readLine());
            words.add(sb.toString()); reverse.add(sb.reverse().toString());
        }

        words.sort(null); reverse.sort(null);
        for (int i = 0; i <= words.size(); i++) {
            if (words.get(0).compareTo(reverse.get(0)) < 0) {
                output += words.get(0);
                sb = new StringBuilder(words.get(0));
                words.remove(0); reverse.remove(sb.reverse().toString());
            } else {
                output += reverse.get(0);
                sb = new StringBuilder(reverse.get(0));
                reverse.remove(0); words.remove(sb.reverse().toString());
            }

            if (words.size() == 0 || reverse.size() == 0) {
                break;
            }
        }

        if (words.get(0).compareTo(reverse.get(0)) < 0) {
            output += words.get(0);
            sb = new StringBuilder(words.get(0));
            words.remove(0); reverse.remove(sb.reverse().toString());
        } else {
            output += reverse.get(0);
            sb = new StringBuilder(reverse.get(0));
            reverse.remove(0); words.remove(sb.reverse().toString());
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