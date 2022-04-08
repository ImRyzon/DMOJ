import java.io.*;
import java.util.*;

public class DiabloBot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] array = line.split(" ");
            if (array[0].contains("'s")) {
                System.out.println("Set");
            } else if (array.length > 2 && array.length <= 4 && array[array.length-2].equalsIgnoreCase("of")) {
                System.out.println("Magic");
            } else if (array[0].equalsIgnoreCase("Damaged") || array.length != 2) {
                System.out.println("Normal");
            } else if (array.length == 2) {
                System.out.println("Not sure, take anyways");
            }
        }
    }
}
