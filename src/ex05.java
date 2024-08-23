import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = 5;
        y = 0;

        while (x > 2) {
            y = y + x;
            x = x - 1;
            System.out.println(y);
        }
    }
}
