import java.util.*;
public class PlayfulPlaydoughs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        int[] nums1 = new int[2];
        nums1[0] = Integer.parseInt(line1[0]);
        nums1[1] = Integer.parseInt(line1[1]);
        String[] playdoughsReplace = sc.nextLine().split(" ");
        int[] playdoughs = new int[nums1[0]];

        for (int i = 0; i < nums1[0]; i++) {
            playdoughs[i] = Integer.parseInt(playdoughsReplace[i]);
        }

        for (int i = 0; i < nums1[1]; i++) {
            
        }
    }
    
}
