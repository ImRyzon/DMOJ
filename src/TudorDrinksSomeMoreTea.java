import java.util.*;
public class TudorDrinksSomeMoreTea {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] array = new String[7];
        int counter = 0;

        for (int i = 0; i < 7; i++) {
            array[i] = sc.nextLine();
        }

        String arrayString = Arrays.toString(array);
        arrayString = arrayString.replaceAll("[^a-zA-Z0-9]", "");

        int index = 0;

        for (int i = 0; i < 7; i++) {
            index = arrayString.indexOf("JJ");

            if (index == -1) {
                break;
            } else if (index == 0) {
                int length = arrayString.length();
                arrayString = arrayString.substring(index + 2, length);
                counter++;
                System.out.println(arrayString);
            } else {
                int length = arrayString.length();
                arrayString = arrayString.substring(0, index) + arrayString.substring(index + 2, length);
                counter++;
                System.out.println(arrayString);
            }
        }

        for (int i = 0; i < 7; i++) {
            index = arrayString.indexOf("J");

            if (index == -1) {
                break;
            } else if (index ==0) {
                int length = arrayString.length();
                arrayString = arrayString.substring(index + 1, length);
                counter++;
                System.out.println(arrayString);
            } else {
                int length = arrayString.length();
                arrayString = arrayString.substring(0, index) + arrayString.substring(index + 1, length);
                counter++;
                System.out.println(arrayString);
            }
        }

        System.out.println(counter);
    }
}
