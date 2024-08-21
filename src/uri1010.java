import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double valorTotal = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
        sc.close();
    }
}
