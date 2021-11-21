import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        int n=1, x=1, r;
        Scanner input = new Scanner(System.in);


        System.out.println("Test");
        //System.out.print("N?");
        //x = input.nextInt();

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
