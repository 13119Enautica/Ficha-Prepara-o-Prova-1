import groovyjarjarantlr4.v4.gui.SystemFontMetrics;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int i, a;
        Scanner input = new Scanner(System.in);

        System.out.print("i: ");
        i = input.nextInt();

        if(i!=0){
            System.out.println("i!=0");
            System.out.println("i="+i);
        }else
            System.out.println("i=0");
    }
}
