import java.util.*;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        double a, b=0, b1=0;

        System.out.println("Menu");
        System.out.println("1. Operação");
        System.out.println("2. Subtração");
        System.out.println("3. Divição");
        System.out.println("4. Exit");
        System.out.print("a: ");
        a = input.nextDouble();

        if(a!=1 | a!=2 | a!=3 | a!=4){
            if(a==1){
                System.out.print("Operaçao: ");
                c = input.nextInt();
                while(c!=0){
                    System.out.print("B: ");
                    b1 = input.nextDouble();
                    b = b + b1;
                    c=c-1;
                }
            }
            if(a==2){
                System.out.print("Subtração: ");
                c = input.nextInt();
                while(c!=0){
                    System.out.print("B: ");
                    b1 = input.nextDouble();
                    b = b1 - b;
                    c=c-1;
                }
            }
            if(a==3){
                System.out.print("Diviçore: ");
                b1 = input.nextDouble();
                System.out.print("Dividendo: ");
                b = input.nextDouble();
                b = b1 / b;
            }
            if(a==4){
                System.out.println("Exit");
                System.exit(0);
            }
        }

        System.out.println(b);

    }
}
