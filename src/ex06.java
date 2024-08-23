import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        x = 2;
        y = 0;

        while (x < 60) {
            x= x * 2;
            y = y + 10;

            System.out.println(x);
        }
    }
}
