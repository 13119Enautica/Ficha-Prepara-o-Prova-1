import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        int n=1, x=1, r;

        System.out.println("Tabuada");

        while (x!=11){
            while(n!=11){
                r=x*n;
                System.out.println(n+" * "+x+"= "+r);
                n++;
            }
            System.out.println("");
            n=1;
            x++;
        }


    }
}
