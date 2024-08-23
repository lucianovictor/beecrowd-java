import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();
        double y = sc.nextInt();

        x = 100;
        y = 100;

        while( x != y) {
            System.out.print("olha");
            x = Math.sqrt(y);
        }
    }
}
