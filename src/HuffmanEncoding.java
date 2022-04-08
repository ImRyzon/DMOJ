import java.util.*;
public class HuffmanEncoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String[] array = new String[k];
        String[] arrayLetters = new String[k];
        String[] arrayNumbers = new String[k];
        String letter = "";
        String number = "";
        for(int i = 0; i < k; i++) {
            array[i] = sc.nextLine();
            letter = array[i];
            number = letter.replaceAll("[^0-9]", "");
            arrayNumbers[i] = number;
            letter = letter.replaceAll("[^a-zA-Z]", "");
            arrayLetters[i] = letter;
        }
        String code = sc.nextLine();
        int index = 0;
        for (int i = 0; i < k; i++) {
            index = code.indexOf(arrayNumbers[i]);
            do {
                if (index == -1) {
                    break;
                } else {
                    code = code.replaceFirst(arrayNumbers[i], "");
                    System.out.print(arrayLetters[i]);
                }
                index = code.indexOf(arrayNumbers[i]);
            } while (index != -1);
        }

    }
}
