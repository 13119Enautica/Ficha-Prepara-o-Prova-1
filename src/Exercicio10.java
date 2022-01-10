import java.io.File;
import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {
        File f = new File ("src/data/hello.java");
        File f1= new File("C:/Users/Duarte/IdeaProjects/Ficha-Prepara-o-Prova-1/src/data/hello.java");
        File f2= new File("src/data/alunos.dat");

        System.out.println();
        System.out.println("Nome do primeiro ficheiro: "+f.getName());
        System.out.println("Caminho: "+f.getPath());
        System.out.println("Caminho Absoluto: "+f.getAbsolutePath());
        System.out.println("Diretorio pai: "+f.getParent());
        System.out.println(f.getAbsoluteFile().exists() ? "existe": "nao existe");
        System.out.println(f.canWrite() ? "pode ser gravado" : "Nao pode ser gravado");


        System.out.println();
        System.out.println("Nome do primeiro ficheiro: "+f1.getName());
        System.out.println("Caminho: "+f1.getPath());
        System.out.println("Caminho Absoluto: "+f1.getAbsolutePath());
        System.out.println("Diretorio pai: "+f1.getParent());
        System.out.println(f1.getAbsoluteFile().exists() ? "existe": "nao existe");


        System.out.println();
        System.out.println("Nome do primeiro ficheiro: "+f2.getName());
        System.out.println("Caminho: "+f2.getPath());
        System.out.println("Caminho Absoluto: "+f2.getAbsolutePath());
        System.out.println("Diretorio pai: "+f2.getParent());
        System.out.println(f2.getAbsoluteFile().exists() ? "existe": "nao existe");
    }
}
