import java.io.*;
public class StringFinding {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        String s = br.readLine().trim(), t = br.readLine().trim(); int index = s.indexOf(t); System.out.println(index);
    }
}