import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Ana");
        nomes.add("Pedro");

        System.out.println(nomes);

        System.out.println("\n==>While loop");
        int i=0;
        while(i<nomes.size()){
            System.out.println(nomes.get(i));
            i++;
        }

    }
}
