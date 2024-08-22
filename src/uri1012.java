import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, areatri,circu, trap, qua, tri;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areatri = A * C /2.0;
        circu = 3.14159 * C * C;
        trap = (A + B) / 2.0 * C;
        qua = B * B;
        tri = A * B;

        System.out.printf("TRIANGULO = %.3f\n", areatri);
        System.out.printf("CIRCULO = %.3f\n", circu);
        System.out.printf("TRAPEZIO = %.3f\n", trap);
        System.out.printf("QUADRADO = %.3f\n", qua);
        System.out.printf("RETANGULO = %.3f\n", tri);

        sc.close();
    }
}
