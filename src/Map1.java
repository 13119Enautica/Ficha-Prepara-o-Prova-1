import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String>mapaNomes=new HashMap<Integer, String>();
        mapaNomes.put(1,"João Soares");
        mapaNomes.put(2,"Maria Betânia");
        mapaNomes.put(3,"Gerardo Azevedo");

        System.out.println("Todos os mapeamentos");
        System.out.println(mapaNomes);
        System.out.println("Valor da chave 3:");
        System.out.println(mapaNomes.get(3));
    }
}
