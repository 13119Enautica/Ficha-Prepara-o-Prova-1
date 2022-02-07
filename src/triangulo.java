import java.util.*;

public class triangulo {
    public static void main(String[] args) {
        int a, n, b, max=10;
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        a = input.nextInt();

        if (a <= max && a >= 0) {
            b = a;
            while (b != 0) {
                n = 0;
                while (n != a) {
                    System.out.print("* ");
                    n++;
                }
                System.out.println();
                b--;
                a--;
            }
        }
        if (a>max) {
            System.out.println("Erro maior que 10");
        }
    }
}
