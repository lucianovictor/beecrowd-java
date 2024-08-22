import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("AREA = %.4fn", area);
        System.out.printf("PERIMETRO = %.4fn", perimetro);
        System.out.printf("DIAGONAL= %.4fn", diagonal);

        sc.close();
    }
}
