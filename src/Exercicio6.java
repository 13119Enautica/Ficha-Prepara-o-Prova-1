import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, money=50;
        int nota20=0, nota10=0, nota5=0;
        int moeda2=0, moeda1=0, moeda50=0, moeda20=0,moeda10=0, moeda05=0, moeda01=0;

        System.out.print("N? ");
        n = input.nextDouble();


        if(n<money && n>0){
            while(n!=money){
                if(n+20<money || n+20==money){
                    n=n+20;
                    nota20++;
                }
                if(n+10<money || n+10==money){
                    n=n+10;
                    nota10++;
                }
                if(n+5<money || n+5==money){
                    n=n+5;
                    nota5++;
                }
                if(n+2<money || n+2==money){
                    n=n+2;
                    moeda2++;
                }
                if(n+1<money || n+1==money){
                    n=n+1;
                    moeda1++;
                }
                if(n+0.50<money || n+0.50==money){
                    n=n+0.50;
                    moeda50++;
                }
                if(n+0.20<money || n+0.20==money){
                    n=n+0.20;
                    moeda20++;
                }
                if(n+0.10<money || n+0.10==money){
                    n=n+0.10;
                    moeda10++;
                }
                if(n+0.05<money || n+0.05==money){
                    n=n+0.05;
                    moeda05++;
                }
                if(n+0.01<money || n+0.01==money){
                    n=n+0.01;
                    moeda01++;
                }
            }
            //System.out.println("N: "+n);
            if(nota20!=0){
                System.out.println("Nota(s)20: "+nota20);
            }
            if(nota10!=0){
                System.out.println("Nota(s)10: "+nota10);
            }
            if(nota5!=0){
                System.out.println("Nota(s)5: "+nota5);
            }
            if(moeda2!=0){
                System.out.println("Moeda(s)2: "+moeda2);
            }
            if(moeda1!=0){
                System.out.println("Moeda(s)1: "+moeda1);
            }
            if(moeda50!=0){
                System.out.println("Moeda(s)0.50: "+moeda50);
            }
            if(moeda20!=0){
                System.out.println("Moeda(s)0.20: "+moeda20);
            }
            if(moeda10!=0){
                System.out.println("Moeda(s)0.10: "+moeda10);
            }
            if(moeda05!=0){
                System.out.println("Moeda(s)0.05: "+moeda05);
            }
            if(moeda01!=0){
                System.out.println("Moeda(s)0.01: "+moeda01);
            }
        } else if(n==money){
            System.out.println("Nao tem troco");
        } else if(n>money || n<0){
            System.out.println("Impossivel");
        }

    }
}
