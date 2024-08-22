import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R, V;
        double pi = 3.14159;
        R = sc.nextDouble();
        V = 4.0 / 3.0 * pi * Math.pow(R, 3.0);
        System.out.printf("VOLUME = %.3f\n",V);
        sc.close();
    }
}
