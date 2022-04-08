import java.util.*;
import java.io.*;
public class AlexAndAnimalRights {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int r = readInt(); int c = readInt();
        boolean hashtag = false, monkey = false;
        int counter = 0;

        for (int i = 0; i < r; i++) {

            String[] line = readLine().split("");

            for (int j = 0; j < line.length; j++) {

                if (line[j].equals("#")) {
                    if (monkey && hashtag) {
                        counter++;
                        monkey = false;
                        hashtag = false;
                    } else {
                        hashtag = true;
                        monkey = false;
                    }
                    hashtag = true;
                } else if (line[j].equals(".")) {
                    hashtag = false;
                    monkey = false;
                } else if (line[j].equals("M")) {
                    monkey = true;
                }
            }

            hashtag = false;
            monkey = false;
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