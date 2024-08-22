import java.util.Scanner;

public class ur1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;
        x = sc.nextInt();
        y = sc.nextDouble();

        double media =(x / y) ;
        System.out.printf("A media em km/l %.3f", media);

        sc.close();
    }
}
