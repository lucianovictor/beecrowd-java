import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,h;
        double vh,s;

        n = sc.nextInt();
        h = sc.nextInt();
        vh = sc.nextDouble();
        s = vh * h;

        System.out.println("NUMBER =" + n);
        System.out.printf("SALARY = U$ %.2f%n",s);

        sc.close();

    }
}
