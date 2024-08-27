import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; i< X ; i++) {
            Y = Y + i;
        }
        System.out.println(Y);
        sc.close();
    }
}
