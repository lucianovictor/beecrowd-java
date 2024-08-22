import java.util.Scanner;

public class uri1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        double x2, y2;
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double xy = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

        System.out.printf("%.4f", xy);
        sc.close();

    }
}
