import java.util.Scanner;

public class uri1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, quant, resto, nota;

        N = sc.nextInt();
        System.out.println(N);

        resto = N;

        nota=100;
        quant =resto / nota;
        System.out.println(quant + "nota(s) de R$" + nota +",00");
        resto = resto % nota;

        nota=50;
        quant =resto / nota;
        System.out.println(quant + "nota(s) de R$" + nota +",00");
        resto = resto % nota;

        nota=20;
        quant =resto / nota;
        System.out.println(quant + "nota(s) de R$" + nota +",00");
        resto = resto % nota;

        nota=10;
        quant =resto / nota;
        System.out.println(quant + "nota(s) de R$" + nota +",00");
        resto = resto % nota;

        nota=5;
        quant =resto / nota;
        System.out.println(quant + "nota(s) de R$" + nota +",00");
        resto = resto % nota;

        nota=2;
        quant =resto / nota;
        System.out.println(quant + "nota(s) de R$" + nota +",00");
        resto = resto % nota;

        System.out.println(resto + "nota(s) de R$ 1,00");

        sc.close();
    }
}
