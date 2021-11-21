import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.print("a:");
        a = input.nextInt();

        if(a>0){
            System.out.println("maior que 0");
            if(a>100){
                System.out.println("maior que 100");
            }else if(a>500){
                System.out.println("mairo que 500");
            }
        }else{
            System.out.println("menor que 0");
        }
    }
}
