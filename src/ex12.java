import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; Y< X ; i++) {
            X = X - 2;
            Y = Y + 1;

            System.out.println(i);
        }
        sc.close();
    }
}
