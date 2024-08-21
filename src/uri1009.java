import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;

        double sala, vendas, total;

        name = sc.next();
        sala = sc.nextDouble();
        vendas = sc.nextDouble();

        total = sala + vendas *0.15;
        System.out.printf("TOTAL: R$ %.2f\n", total);

        sc.close();
    }
}
