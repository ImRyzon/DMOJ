import java.util.*;

public class SumsAndDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("? 1 2\n");
        System.out.flush();
        int a = sc.nextInt();

        System.out.print("? 1 2\n");
        System.out.flush();
        int b = sc.nextInt();

        array[0] = b / 2 + a;
        array[1] = b / 2;

        int x = (b / 2 + a) * 2;
        for(int i = 3; i <= n; i++) {
            System.out.print("? 1 " + i + "\n");
            System.out.flush();
            int nxt = sc.nextInt();

            array[i - 1] = x - nxt;
            x += nxt;
        }
        System.out.print("! ");
        for(int i = 0; i < array.length; i++) {
            if(i != array.length - 1){
                System.out.print(array[i] + " ");
            } else System.out.println(array[i]);
        }
    }
}