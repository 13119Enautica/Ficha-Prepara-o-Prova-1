import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        //bissextos múltiplos de 4 que não são múltiplos de 100

        int bissexto=0;
        System.out.print("Ano: ");
        ano = input.nextInt();

        if (ano % 4 == 0) {
            bissexto++;
            //System.out.println("Ano multiplo de 4");
        }
        if(ano % 100 == 0) {
            bissexto++;
            //System.out.println("Ano multiplo de 100");
        }
        if (ano % 400 == 0) {
            bissexto++;
            //System.out.println("Ano multiplo de 400");
        }

        if (bissexto==1 || bissexto==3){
            System.out.println("Ano bissexto.");
        }else {
            System.out.println("Ano não bissexto.");
        }



    }
}
