import java.util.*;
public class MidpointFormula {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        double x1 = sc.nextInt();
        System.out.println("Enter y1: ");
        double y1 = sc.nextInt();
        System.out.println("Enter x2: ");
        double x2 = sc.nextInt();
        System.out.println("Enter y2: ");
        double y2 = sc.nextInt();
        System.out.println("The midpoint is: " + calcMidpoint(x1, y1, x2, y2));
    }

    public static String calcMidpoint (double x1, double y1, double x2, double y2) {
        return (x1+x2)/2 + ", " + (y1+y2)/2;
    }
}
