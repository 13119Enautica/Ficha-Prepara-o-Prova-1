import java.util.*;

public class Exercício_1 {

    public static void main(String[] args) {

        int nota5 = 5, nota10 = 10, nota20 = 20, moeda1 = 1, moeda2 = 2;
        int notas5=0, notas10=0, notas20=0, moedas1=0, moedas2=0;
        int totalnotas=0, totalmoedas=0;
        int conta, valor_pagar;
        Scanner input = new Scanner(System.in);

        System.out.println("Conta 1 valor igual a 50");
        System.out.println("Conta 2 valor igual a 100");
        System.out.println("Conta 3 valor é dado por o utilizador");
        System.out.print("Tipo de Conta: ");
        conta = input.nextInt();

        if(conta==1){
            conta=50;
        }
        if(conta==2){
            conta=100;
        }
        if(conta==3){
            System.out.print("Valor da conta: ");
            conta = input.nextInt();
        }

        System.out.print("Valor a pagar: ");
        valor_pagar = input.nextInt();
        if(valor_pagar<conta && valor_pagar>=0) {
            while (valor_pagar < conta) {
                if (valor_pagar + nota20 <= conta) {
                    valor_pagar = valor_pagar + nota20;
                    notas20++;
                    totalnotas++;
                    //System.out.println("1 nota de 20$");
                } else if (valor_pagar + nota10 <= conta) {
                    valor_pagar = valor_pagar + nota10;
                    notas10++;
                    totalnotas++;
                    //System.out.println("1 nota de 10$");
                } else if (valor_pagar + nota5 <= conta) {
                    valor_pagar = valor_pagar + nota5;
                    notas5++;
                    totalnotas++;
                    //System.out.println("1 nota de 5$");
                } else if (valor_pagar + moeda2 <= conta) {
                    valor_pagar = valor_pagar + moeda2;
                    moedas2++;
                    totalmoedas++;
                    //System.out.println("1 moeda de 2$");
                } else {
                    valor_pagar = valor_pagar + moeda1;
                    moedas1++;
                    totalmoedas++;
                    //System.out.println("1 moeda de 1$");
                }
            }
            System.out.println(" ");
            if (notas20 != 0) {
                System.out.println(notas20 + " nota(s) de 20$");
            }
            if (notas10 != 0) {
                System.out.println(notas10 + " nota(s) de 10$");
            }
            if (notas5 != 0) {
                System.out.println(notas5 + " nota(s) de 5$");
            }
            if (moedas2 != 0) {
                System.out.println(moedas2 + " moeda(s) de 2$");
            }
            if (moedas1 != 0) {
                System.out.println(moedas1 + " moeda(s) de 1$");
            }
            if (totalnotas != 0) {
                System.out.println("Total de notas: " + totalnotas);
            }
            if (totalmoedas != 0) {
                System.out.println("Total de moedas: " + totalmoedas);
            }
        }else if(valor_pagar==conta){
            System.out.println("Valor "+ valor_pagar + " é igual "+conta+"." );
            System.out.println("Logo não tem troco.");
        } else if(valor_pagar>conta){
            System.out.println("Valor " + valor_pagar +  " a pagar maior que "+conta+".");
        }else if(valor_pagar<=0){
            System.out.println("Valor " + valor_pagar +  " é menor que 0.");
        }

    }
}
