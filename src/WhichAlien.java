import java.util.Scanner;

public class WhichAlien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ant = sc.nextInt();
        int eyes = sc.nextInt();
        if (ant >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
            if (ant <= 6 && eyes >= 2) {
                System.out.println("VladSaturnian");
            }
        } else if (ant <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
            if (ant <= 2 && eyes <= 3) {
                System.out.println("GraemeMercurian");
            }
        } else if (ant <= 2 && eyes <= 3){
            System.out.println("GraemeMercurian");
        }
    }
}
