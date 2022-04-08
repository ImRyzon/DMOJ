import java.util.*;
import java.io.*;
public class FestiveGroups {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        List<Integer> people = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            people.add(readInt());
        }

        while (people.size() != 0) {
            Collections.sort(people);
            int num = people.get(0);

            for (int i = 1; i < people.size(); i++) {
                if (people.get(i) % num == 0 || num % people.get(i) == 0) {
                    people.remove(i);
                }
            }

            counter++;
            System.out.println(people.size());
        }

        System.out.println(counter);
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