import java.util.*;
import java.io.*;
public class Punchy {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int a = 0, b = 0, instruction;

        do {
            instruction = readInt();
            if (instruction == 7) {break;}
            char char1 = readCharacter();
            if (instruction == 2 && char1 == 'A') {System.out.println(a); continue;}
            else if (instruction == 2 && char1 == 'B') {System.out.println(b); continue;}
            String char2 = next();
            if (instruction == 1 && char1 == 'A') {a = Integer.parseInt(char2); continue;}
            else if (instruction == 1 && char1 == 'B') {b = Integer.parseInt(char2); continue;}
            if (instruction == 3 && char1 == 'A') {continue;}
            else if (instruction == 3 && char1 == 'B') {b = Integer.parseInt(char2); continue;}
            if (instruction == 1 && char1 == 'A') {a = Integer.parseInt(char2); continue;}
            else if (instruction == 1 && char1 == 'B') {b = Integer.parseInt(char2); continue;}
            if (instruction == 1 && char1 == 'A') {a = Integer.parseInt(char2); continue;}
            else if (instruction == 1 && char1 == 'B') {b = Integer.parseInt(char2); continue;}
            if (instruction == 1 && char1 == 'A') {a = Integer.parseInt(char2); continue;}
            else if (instruction == 1 && char1 == 'B') {b = Integer.parseInt(char2); continue;}
        } while (instruction != 7);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
