import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        int ano, dia, mes;
        Scanner input = new Scanner(System.in);

        int bissexto=0;

        System.out.print("Dia: ");
        dia = input.nextInt();

        System.out.print("Mes: ");
        mes = input.nextInt();

        System.out.print("Ano: ");
        ano = input.nextInt();
        System.out.println("day:      "+ dia +"/"+ mes +"/"+ ano);

        if(dia<32 && mes<13){
            if (ano % 4 == 0) {
                bissexto++;
            }
            if(ano % 100 == 0) {
                bissexto++;
            }
            if (ano % 400 == 0) {
                bissexto++;
            }

            if(mes==1 && dia<31 || mes==3 && dia<31 || mes==5 && dia<31 || mes==6 && dia<31 || mes==7 && dia<31 || mes==8 && dia<31 || mes==10 && dia<31 || mes==12 && dia<31 ){
                dia=dia+1;
                System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
            }else if(mes == 1 || mes == 3 || mes == 5 || mes == 6 || mes == 7 || mes == 8 || mes == 10 ){
                dia=1;
                mes=mes+1;
                System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
            }else if(mes==12){
                dia=1;
                mes=1;
                ano=ano+1;
                System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
            }else if (mes==2){
                if(dia<28){
                    dia=dia+1;
                    System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
                }else if(dia == 28 && bissexto == 1 || bissexto == 3) {
                    dia = dia + 1;
                    System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
                }else if (dia == 28) {
                    dia = 1;
                    mes = mes + 1;
                    System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
                }else if (dia == 29 && bissexto == 1 || bissexto == 3) {
                    dia = 1;
                    mes = mes + 1;
                    System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
                }else {
                    System.out.println("Erro dia 29 nao existe no ano "+ano);
                }
            }else if(mes==4 && dia<30 || mes==9 && dia<30 || mes==11 && dia<30){
                dia=dia+1;
                System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
            }else if(mes==4 && dia==30 || mes==9 && dia==30 || mes==11 && dia==30){
                dia=1;
                mes=mes+1;
                System.out.println("next day: "+dia +"/"+ mes +"/"+ ano);
            }else if(mes==4 || mes==9 || mes==11 ){
                System.out.println("Mes "+mes+" tem 30 dias nao 31");
            }


        }else if(dia>31){
            System.out.println("Dia maior que 31");
        }else{
            System.out.println("Mes maior que 12");
        }
    }
}
