import java.util.Scanner;

public class uri1004 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int X, Y, Z;

        X = sc.nextInt();

        Y = sc.nextInt();

        Z = X * Y;

        System.out.println("PROD =" + Z);

        sc.close();
    }
}
