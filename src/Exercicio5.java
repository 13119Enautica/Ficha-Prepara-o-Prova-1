import java.util.*;

class Retrangulo {
    private int altura;
    private int lado;

    public int getAltura() {
        return altura;
    }
    public int getLado(){
        return lado;
    }

}
class Quadrado {
    private int lado;
    public int getLado() {
        return lado;
    }

}

class Area<area> extends Quadrado{
    double area = 0.0;
    //area = (retrangulo.getAltura() * retrangulo.getLargura());
    //return area;
}

public class Exercicio5 {

    public static void main(String[] args) {
        int a,l;
        Scanner input = new Scanner(System.in);
        Retrangulo retrangulo = new Retrangulo();
        Quadrado quadrado = new Quadrado();

        System.out.print("lado:");
        l = input.nextInt();
        //retrangulo.getLado()=l;
        //quadrado.getLado()=l;
        System.out.print("altura: ");
        a =input.nextInt();
        //retrangulo.getAltura()=a;

        //System.out.println(quadrado.getLado());
        //System.out.println(retrangulo.getAltura());
    }
}
