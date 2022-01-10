import java.io.*;

public class Exercicio9 {
    public static void main(String[] args) {
        File ficheiro = new File ("src/data/teste.dat");

        if(ficheiro.exists()){
            System.out.println("O ficheiro teste.dat existe");
        }else{
            System.out.println("O ficheiro nao existe");
        }
    }
}
