import java.io.*;

public class AveragingAverages {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] o = br.readLine().split(" ");
        Integer[] a = new Integer[2];
        a[0] = Integer.parseInt(o[0]);
        a[1] = Integer.parseInt(o[1]);
        String[] f = br.readLine().split(" ");
        Integer[] g = new Integer[a[0]];
        Integer[] c = new Integer[a[1]];
        int s = 0;
        for (int i = 0; i < a[0]; i++) {
            g[i] = Integer.parseInt(f[i]);
        }
        for (int i = 0; i < a[1]; i++) {
            String[] u = br.readLine().split(" ");
            int[] k = new int[2];
            k[0] = Integer.parseInt(u[0]);
            k[1] = Integer.parseInt(u[1]);
            for (int j = k[0]-1; j < k[1]; j++) {
                s += g[j];
            }
            s = s / ((k[1] + 1) - k[0]);
            c[i] = s;
            s = 0;
        }
        for (int i = 0; i < a[1]; i++) {
            System.out.println(c[i]);
        }
    }
}
