import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; i< X ; i++) {
            System.out.print(i);
            System.out.println(X);

            Y = Y + 10;
        }
        sc.close();
    }
}
