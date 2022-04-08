import java.io.*;
import java.util.*;
public class Olympiads {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int parse = Integer.parseInt(line[0]);
        int[] nums = new int[parse];
        String[] line2 = br.readLine().split(" ");
        for (int i = 0; i < parse; i++) {
            nums[i] = Integer.parseInt(line2[i]);
        }
        int sum = nums[0] + nums[1];
        int parse1 = Integer.parseInt(line[1]);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] <= parse1 && nums[i] + nums[j] > sum)  {
                    if (i != j) {
                        sum = nums[i] + nums[j];
                    }
                }
            }
        }
        System.out.println(sum);


    }
}
