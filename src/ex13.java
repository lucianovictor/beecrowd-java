import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f%n", vet[i]);
        }
        sc.close();
    }
}
