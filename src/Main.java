import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A, B, X;
            A = sc.nextInt();
            B = sc.nextInt();
            X = A + B;
            System.out.println("X = " + X);
            sc.close();
        }
    }
