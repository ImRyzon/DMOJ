import java.util.*;
import java.io.*;
public class EggysGamblingAddiction {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        for (int i = 0; i < n; i++) {
            boolean canWin = false;
            boolean isLost = false;
            String[][] board = new String[3][3];
            for (int j = 0; j < 3; j++) {
                String[] readLine = readLine().split(" ");
                board[j][0] = readLine[0];
                board[j][1] = readLine[1];
                board[j][2] = readLine[2];
            }
            for (int j = 0; j < 3; j++) {
                String check1 = board[j][0] + board[j][1] + board[j][2];
                String check2 = board[0][j] + board[1][j] + board[2][j];

                if (check1.replaceAll("[^O]", "").length() == 3) {
                    isLost = true;
                    break;
                } else if (check1.replaceAll("[^X]", "").length() == 2 && check1.replaceAll("[^-]", "").length() == 1) {
                    canWin = true;
                }

                if (check2.replaceAll("[^O]", "").length() == 3) {
                    isLost = true;
                    break;
                } else if (check2.replaceAll("[^X]", "").length() == 2 && check2.replaceAll("[^-]", "").length() == 1) {
                    canWin = true;
                }
            }
            String diagCheck1 = board[0][0] + board[1][1] + board[2][2];
            if (diagCheck1.replaceAll("[^O]", "").length() == 3) {
                isLost = true;
            } else if (diagCheck1.replaceAll("[^X]", "").length() == 2 && diagCheck1.replaceAll("[^-]", "").length() == 1) {
                canWin = true;
            }
            diagCheck1 = board[0][2] + board[1][1] + board[2][0];
            if (diagCheck1.replaceAll("[^O]", "").length() == 3) {
                isLost = true;
            } else if (diagCheck1.replaceAll("[^X]", "").length() == 2 && diagCheck1.replaceAll("[^-]", "").length() == 1) {
                canWin = true;
            }
            if (isLost) {
                System.out.println("Lose");
                continue;
            }

            if (canWin) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
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