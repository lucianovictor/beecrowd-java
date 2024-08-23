import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int age1 = sc.nextInt();
        String name2 = sc.next();
        int age2 = sc.nextInt();

        double media = (age1 + age2) / 2.0;
        System.out.printf("A idade media de %s e %s é de %.1f anos ", name1, name2, media);

        sc.close();
    }
}
