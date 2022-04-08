import java.io.*;

public class ModuloSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        Integer K = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        Integer[] nums = new Integer[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] % K > nums[j+1] % K || (nums[j] % K == nums[j+1] % K && nums[j] > nums[j+1])) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < N-1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[N-1]);
    }
}
