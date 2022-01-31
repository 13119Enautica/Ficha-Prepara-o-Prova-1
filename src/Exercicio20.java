import java.util.*;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, x;


        System.out.print("N: ");
        n = input.nextDouble();

        System.out.print("X: ");
        x = input.nextDouble();

        if (x != n) {
            if(x>n){
                System.out.println("X maior que N");
            }if(x<n){
                System.out.println("N maior que X");
            }

        } else {
            System.out.println("N igual X");
        }

    }
}
