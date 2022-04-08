import java.util.*;
import java.io.*;
public class PhoneBook {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n1 = readInt();
        String[] names = new String[n1];
        String[] numbers = new String[n1];
        int[] numCalls = new int[n1];

        for (int i = 0; i < n1; i++) {
            String[] input = readLine().split(" ");
            names[i] = input[0];
            numbers[i] = input[1];
        }

        int n2 = readInt();

        for (int i = 0; i < n2; i++) {
            String line = readLine();
            int index = Arrays.asList(numbers).indexOf(line);
            numCalls[index] = numCalls[index] + 1;
        }

        String output = names[0];
        int highestCall = numCalls[0];
        String currentNumber = numbers[0];

        for (int i = 0; i < names.length; i++) {
            if (numCalls[i] > highestCall) {
                highestCall = numCalls[i];
                output = names[i];
                currentNumber = numbers[i];
            } else if (numCalls[i] == highestCall) {
                if (Integer.parseInt(numbers[i]) < Integer.parseInt(currentNumber)) {
                    highestCall = numCalls[i];
                    output = names[i];
                    currentNumber = numbers[i];
                }
            }
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