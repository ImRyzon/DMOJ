import java.util.*;
import java.io.*;
public class EndUserLicenseAgreement {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        char[] virus = {'v', 'i', 'r', 'u', 's'};
        String line = readLine().toLowerCase().replaceAll("[^virus]", "");
        boolean isVirus = false;
        int counter = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == virus[counter]) {
                counter++;
            }

            if (counter == 5) {
                isVirus = true;
                break;
            }
        }

        if (isVirus) {
            System.out.println("WARNING: Virus detected!");
        } else {
            System.out.println("Safe to use!");
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