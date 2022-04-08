import java.util.*;

public class BridgeTransport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        int minus = N-3;
        int counter = 0;
        if (minus > 0) {
            for (int i = 0; i < minus; i++) {
                sum = (array[i] + array[i+1] + array[i+2] + array[i+3]);
                if (sum <= W) {
                    counter++;
                } else if (i != 0) {
                    counter += 3;
                    break;
                }
                sum = 0;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            if (sum <= W) {
                counter = array.length;
            } else {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] <= W) {
                        counter++;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
