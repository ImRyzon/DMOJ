import java.io.*;
import java.util.*;

public class TugOfWar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String strengths = sc.nextLine();
        String[] array = strengths.split(" ");
        int[] nums = new int[n];
        int parse = 0;

        for (int i = 0; i < n; i++) {
            parse = Integer.parseInt(array[i]);
            nums[i] = parse;
        }

        int[] outputs = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (nums[i]);
        }

        int sumDivide = (sum / 2);
        int sumStrengths = 0;
        int compare = 0;
        int sumRest = 0;
        int difference1 = 0;
        int difference2 = 0;

        for (int i = 0; i < n; i++) {

            if (i >= 1) {
                for (int j = 0; j < n-1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

            for (int k = 0; k < n; k++) {
                sumStrengths += nums[k];

                if (sumStrengths > sumDivide) {
                    compare = (sumStrengths - nums[k]);

                    for (int l = (k+1); l < nums.length; l++) {
                        sumRest += nums[l];
                    }

                    difference1 = sumStrengths - sumRest;
                    difference2 = (sumRest + nums[k]) - compare;

                    if (difference1 > difference2) {
                        outputs[i] = difference2;
                        break;
                    } else {
                        outputs[i] = difference1;
                        break;
                    }
                }
            }
            sumStrengths = 0;
            compare = 0;
            sumRest = 0;
            difference1 = 0;
            difference2 = 0;

        }

        System.out.println(Arrays.toString(outputs).replaceAll("[^0-9\\s]", ""));
    }
}
