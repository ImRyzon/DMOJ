import java.util.*;
public class Paradox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(" ");
            String output = "";
            if (line[0].equals("1")) {
                if (output.contains(line[1])) {
                    System.out.println("false");
                } else {
                    output += line[1];
                    System.out.println(output);
                    System.out.println("true");
                }
            } else if (line[0].equals("2"))  {
                if (output.contains(line[1])) {
                    output = output.replace(line[1], "");
                    System.out.println(output);
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else if (line[0].equals("3")) {
                int index = output.indexOf(line[1]);
                System.out.println(index);
            } else if (line[0].equals("4")){
                if (output.length() == 9) {
                    System.out.println("false true");
                } else {
                    System.out.println(output);
                }
            }
        }
    }
}
